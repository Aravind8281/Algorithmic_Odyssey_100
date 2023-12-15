import java.util.*;

class Node {
    Node links[] = new Node[2];

    public Node() {

    }

    boolean contains(int ind) {
        return (links[ind] != null);
    }

    Node get(int ind) {
        return links[ind];
    }

    void put(int ind, Node node) {
        links[ind] = node;
    }
}

class Trie {
    private Node root;

    Trie() {
        root = new Node();
    }

    void insert(int num) {
        Node node = root;
        for (int i = 3; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.contains(bit)) {
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }

    int getMax(int num) {
        Node node = root;
        int maxNum = 0;
        for (int i = 3; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.contains(1 - bit)) {
                maxNum = maxNum | (1 << i);
                node = node.get(1 - bit);
            } else {
                node = node.get(bit);
            }
        }
        return maxNum;
    }
}
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        int[] numbers = {3, 10, 5, 25, 2, 8};
        for (int num : numbers) {
            trie.insert(num);
        }
        System.out.println(trie.getMax(15));
    }
}
