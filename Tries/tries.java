package Tries;
import java.util.*;

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

    // Function to find the longest word that can be built character by character
    public String longestWord(String[] words) {
        // Build Trie
        for (String w : words)
            insert(w);

        String[] result = new String[]{""};//
        dfs(root, result);
        return result[0];
    }//

    // DFS with prefix condition
    private void dfs(TrieNode node, String[] result) {
        if (node == null) return;

        // Only proceed if node is end of a word or root
        if (node != root && !node.isEnd) return;//

        if (node.word != null) {
            if (node.word.length() > result[0].length() ||
               (node.word.length() == result[0].length() && node.word.compareTo(result[0]) < 0)) {
                result[0] = node.word;
            }
        }

        for (int i = 0; i < 26; i++) {//
            if (node.children[i] != null)
                dfs(node.children[i], result);//
        }
    }

    // Test the code
    public static void main(String[] args) {
        tries t = new tries();
        String[] words1 = {"w", "wo", "wor", "worl", "world"};
        String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};//

        System.out.println("Longest Word 1: " + t.longestWord(words1)); // print world
        System.out.println("Longest Word 2: " + t.longestWord(words2)); //  print apple 
    }
}
