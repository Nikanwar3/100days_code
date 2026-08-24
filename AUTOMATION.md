# Daily automation

This repo has a GitHub Actions workflow (`.github/workflows/daily-dsa.yml`) that
runs every day at 09:00 IST. It asks Claude to write one new DSA problem +
Java solution (rotating through topics, avoiding repeats), saves it under
`daily/Day_NNN_.../`, updates the progress table in `README.md`, and commits
+ pushes automatically.

## One-time setup (required before it can run)

1. Get an Anthropic API key: https://console.anthropic.com/settings/keys
2. Add it as a repo secret — **do this in the GitHub UI, not by pasting the
   key into a chat with an AI tool**:
   - Go to `Settings → Secrets and variables → Actions → New repository secret`
   - Name: `ANTHROPIC_API_KEY`
   - Value: your key
3. That's it — the workflow will run on the next scheduled tick, or you can
   trigger it immediately from `Actions → Daily DSA Commit → Run workflow`.

## Cost

Each run is one Claude API call generating a few hundred tokens of output —
this costs a small fraction of a cent per day.

## To pause or stop

- Quickest: `Actions` tab → `Daily DSA Commit` → `⋯` → `Disable workflow`.
- Or delete `.github/workflows/daily-dsa.yml` entirely.
- GitHub also auto-disables scheduled workflows after 60 days of repo
  inactivity — shouldn't happen here since the workflow itself creates
  activity, but worth knowing.
