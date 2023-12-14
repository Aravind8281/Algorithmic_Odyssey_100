import java.util.*;

class Trie {
    private static Trienode root;

    static class Trienode {
        private Map<Character, Trienode> children;
        private boolean flag;

        public Trienode() {
            this.children = new HashMap<>();
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
            if (!current.children.containsKey(c)) {
                Trienode node = new Trienode();
                current.children.put(c, node);
            }

            current = current.children.get(c);
        }

        current.flag = true;
    }

    static boolean search(String s) {
        s = s.toLowerCase();
        Trienode current = root;

        for (char c : s.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false;
            }

            current = current.children.get(c);
        }

        return current.flag;
    }

    static int countDistinct(String s) {
        int count = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            Trienode node = root;
            for (int j = i; j < len; j++) {
                char currentChar = s.charAt(j);
                if (!node.children.containsKey(currentChar)) {
                    Trienode newNode = new Trienode();
                    node.children.put(currentChar, newNode);
                    count++;
                }
                node = node.children.get(currentChar);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("abab");
        System.out.println(trie.countDistinct("abab"));
    }
}
