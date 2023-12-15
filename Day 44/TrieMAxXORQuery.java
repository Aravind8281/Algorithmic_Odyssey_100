// Difficult Question implemnted using gpt 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TrieNode {
    TrieNode[] children = new TrieNode[2];

    boolean containsKey(int bit) {
        return children[bit] != null;
    }

    TrieNode get(int bit) {
        return children[bit];
    }

    void put(int bit, TrieNode node) {
        children[bit] = node;
    }
}

class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containsKey(bit)) {
                node.put(bit, new TrieNode());
            }
            node = node.get(bit);
        }
    }

    int getMax(int num) {
        TrieNode node = root;
        int maxNum = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.containsKey(1 - bit)) {
                maxNum |= (1 << i);
                node = node.get(1 - bit);
            } else {
                node = node.get(bit);
            }
        }
        return maxNum;
    }
}

public class Main {
    public static List<Integer> maxXorQueries(List<Integer> arr, List<List<Integer>> queries) {
        List<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr);

        List<List<Integer>> sortedQueries = new ArrayList<>(queries);
        sortedQueries.sort(Comparator.comparingInt(query -> query.get(0)));

        int index = 0;
        int n = sortedArr.size();
        Trie trie = new Trie();
        List<Integer> result = new ArrayList<>(Collections.nCopies(sortedQueries.size(), -1));

        for (List<Integer> query : sortedQueries) {
            while (index < n && sortedArr.get(index) <= query.get(0)) {
                trie.insert(sortedArr.get(index));
                index++;
            }

            int queryIndex = query.get(1); // Use query.get(1) instead of query.get(2)
            if (index != 0 && queryIndex < result.size()) {
                result.set(queryIndex, trie.getMax(query.get(0)));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(3, 10, 5, 25, 2, 8);
        List<List<Integer>> queries = List.of(
                List.of(2, 0),
                List.of(7, 1),
                List.of(5, 2)
        );

        List<Integer> result = maxXorQueries(arr, queries);

        System.out.println("Result: " + result);
    }
}
