import java.util.*;

class Trie {
    private static Trienode root;

    static class Trienode {
        private Trienode[] children;
        private boolean flag;

        public Trienode() {
            this.children = new Trienode[26];
            this.flag = false;
        }
    }

    static void insert(String S) {
        if (S == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        S = S.toLowerCase();
        if (root == null) {
            root = new Trienode();
        }

        Trienode current = root;

        for (char c : S.toCharArray()) {
            int index = c - 'a';

            if (current.children[index] == null) {
                Trienode node = new Trienode();
                current.children[index] = node;
            }

            current = current.children[index];
        }

        current.flag = true;
    }

   

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("cab");
        trie.insert("cat");

        
    }
}
