class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
    String word;
}

public class tries {
    private TrieNode root;

    public tries() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null)
                node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.isEnd = true;
        node.word = word;
    }

    // Returns true if exact word exists in trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return node.isEnd;
    }

    // Returns true if any inserted word starts with this prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return true;
    }

    // Find longest word where every prefix is also a complete word
    public String longestWord(String[] words) {
        for (String w : words) insert(w);
        String[] result = {""};
        dfs(root, result);
        return result[0];
    }

    // DFS: only go deeper if every prefix is also a complete word
    private void dfs(TrieNode node, String[] result) {
        if (node == null) return;
        if (node != root && !node.isEnd) return;

        if (node.word != null) {
            if (node.word.length() > result[0].length() ||
               (node.word.length() == result[0].length() && node.word.compareTo(result[0]) < 0)) {
                result[0] = node.word;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null)
                dfs(node.children[i], result);
        }
    }

    public static void main(String[] args) {
        tries t = new tries();

        // Basic insert / search / startsWith
        t.insert("apple");
        t.insert("app");
        t.insert("apex");
        System.out.println(t.search("apple"));     // true
        System.out.println(t.search("app"));       // true
        System.out.println(t.search("ap"));        // false (not inserted)
        System.out.println(t.startsWith("ap"));    // true
        System.out.println(t.startsWith("xyz"));   // false

        // Longest word built character by character
        tries t2 = new tries();
        String[] words1 = {"w", "wo", "wor", "worl", "world"};
        System.out.println("\nLongest Word 1: " + t2.longestWord(words1)); // world

        tries t3 = new tries();
        String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println("Longest Word 2: " + t3.longestWord(words2));   // apple
    }
}
