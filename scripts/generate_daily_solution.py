"""
Generates one new DSA problem + Java solution per run, using the Anthropic API,
and records it under daily/. Designed to be run once/day by
.github/workflows/daily-dsa.yml, but safe to run manually too.

Requires env var ANTHROPIC_API_KEY.
"""
import json
import os
import re
from datetime import date
import time

import anthropic

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
DAILY_DIR = os.path.join(REPO_ROOT, "daily")
PROGRESS_FILE = os.path.join(DAILY_DIR, "progress.json")
README_FILE = os.path.join(REPO_ROOT, "README.md")

TOPICS = [
    "Arrays", "Strings", "LinkedList", "Stacks", "Queues", "Recursion",
    "Binary Search", "Binary Trees", "Heaps", "Tries", "Graphs",
    "Dynamic Programming", "Greedy Algorithms", "Sorting", "Two Pointers",
    "Sliding Window", "Backtracking", "Bit Manipulation", "Math & Number Theory",
    "Hashing",
]


def load_progress():
    if os.path.exists(PROGRESS_FILE):
        with open(PROGRESS_FILE) as f:
            return json.load(f)
    return {"entries": []}


def save_progress(progress):
    os.makedirs(DAILY_DIR, exist_ok=True)
    with open(PROGRESS_FILE, "w") as f:
        json.dump(progress, f, indent=2)
        f.write("\n")


def next_day_and_topic(progress):
    day = len(progress["entries"]) + 1
    recent_topics = {e["topic"] for e in progress["entries"][-5:]}
    idx = (day - 1) % len(TOPICS)
    topic = TOPICS[idx]
    tries = 0
    while topic in recent_topics and tries < len(TOPICS):
        idx = (idx + 1) % len(TOPICS)
        topic = TOPICS[idx]
        tries += 1
    return day, topic


def build_prompt(day, topic, progress):
    prior_titles = [e["title"] for e in progress["entries"] if e["topic"] == topic][-5:]
    avoid = (
        f"Avoid repeating any of these previous problems on this topic: {', '.join(prior_titles)}."
        if prior_titles else ""
    )
    return f"""You are contributing Day {day} of a 100-days-of-code Java DSA practice repo.
Topic for today: {topic}.
{avoid}

Produce ONE interview-style problem plus a correct, well-commented Java solution.
Aim for genuine learning value (clear approach explanation, Big-O), not filler.

Respond in EXACTLY this format, nothing else, no markdown code fences:

===TITLE===
<short problem title, Title Case, no punctuation>
===PROBLEM===
<problem statement in markdown, include constraints and 1-2 examples>
===APPROACH===
<2-4 sentence explanation of the approach and time/space complexity>
===CODE===
<complete, compilable Java class named Solution with a main method demonstrating it on the example(s)>
===END===
"""


def parse_response(text):
    def grab(tag_start, tag_end):
        pattern = re.compile(re.escape(tag_start) + r"(.*?)" + re.escape(tag_end), re.S)
        m = pattern.search(text)
        return m.group(1).strip() if m else ""

    title = grab("===TITLE===", "===PROBLEM===")
    problem = grab("===PROBLEM===", "===APPROACH===")
    approach = grab("===APPROACH===", "===CODE===")
    code = grab("===CODE===", "===END===")
    code = re.sub(r"^```[a-zA-Z]*\n?|```$", "", code, flags=re.M).strip()
    return title, problem, approach, code


def slugify(title):
    return re.sub(r"[^a-zA-Z0-9]+", "", title) or "Problem"


def update_readme(progress):
    entries = progress["entries"]
    header = "# 100days_code\n\nJava DSA\n100days\nDSA\n\n## Daily Progress (automated)\n\n"
    rows = "| Day | Date | Topic | Problem |\n|---|---|---|---|\n"
    for e in entries:
        rows += f"| {e['day']} | {e['date']} | {e['topic']} | [{e['title']}]({e['path']}/Problem.md) |\n"
    with open(README_FILE, "w") as f:
        f.write(header + rows)


def main():
    api_key = os.environ["ANTHROPIC_API_KEY"]
    client = anthropic.Anthropic(api_key=api_key)

    progress = load_progress()
    day, topic = next_day_and_topic(progress)
    prompt = build_prompt(day, topic, progress)

    last_err = None
    for attempt in range(3):
        resp = client.messages.create(
            model="claude-sonnet-5",
            max_tokens=2000,
            messages=[{"role": "user", "content": prompt}],
        )
        text = "".join(block.text for block in resp.content if block.type == "text")
        title, problem, approach, code = parse_response(text)
        if title and problem and code:
            break
        last_err = text
        time.sleep(2)
    else:
        raise SystemExit(f"Could not parse model response after retries:\n{last_err}")

    day_dir = os.path.join(DAILY_DIR, f"Day_{day:03d}_{slugify(title)}")
    os.makedirs(day_dir, exist_ok=True)

    with open(os.path.join(day_dir, "Problem.md"), "w") as f:
        f.write(f"# Day {day}: {title}\n\n**Topic:** {topic}\n\n{problem}\n\n## Approach\n\n{approach}\n")

    with open(os.path.join(day_dir, "Solution.java"), "w") as f:
        f.write(code + ("\n" if not code.endswith("\n") else ""))

    progress["entries"].append({
        "day": day,
        "date": date.today().isoformat(),
        "topic": topic,
        "title": title,
        "path": os.path.relpath(day_dir, REPO_ROOT),
    })
    save_progress(progress)
    update_readme(progress)

    print(f"Day {day} ({topic}): {title}")

    gh_out = os.environ.get("GITHUB_OUTPUT")
    if gh_out:
        with open(gh_out, "a") as f:
            f.write(f"day={day}\n")
            f.write(f"title={title}\n")


if __name__ == "__main__":
    main()
