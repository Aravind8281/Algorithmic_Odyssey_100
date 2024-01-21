import java.util.PriorityQueue;
import java.util.HashMap;
class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        this.left  = null;
        this.right=null;
    }

    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;// helps to calculate the cost between two nodes 
    }
}
public class Main {
    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Character, Integer> frequencyMap = buildFrequencyMap(input);
        HuffmanNode root = buildHuffmanTree(frequencyMap);
        HashMap<Character, String> huffmanCodes = generateHuffmanCodes(root);
        System.out.println("Original String: " + input);
        System.out.println("Huffman Codes:");
        for (char c : huffmanCodes.keySet()) {
            System.out.println(c + ": " + huffmanCodes.get(c));
        }
    }
    private static HashMap<Character, Integer> buildFrequencyMap(String input) {// Huffman encoder hashmap
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
    private static HuffmanNode buildHuffmanTree(HashMap<Character, Integer> frequencyMap) {// Huffman decoder hashmap
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();
        for (char c : frequencyMap.keySet()) {
            priorityQueue.add(new HuffmanNode(c, frequencyMap.get(c)));
        }
        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode mergedNode = new HuffmanNode('\0', left.frequency + right.frequency);
            mergedNode.left = left;
            mergedNode.right = right;
            priorityQueue.add(mergedNode);
        }
        return priorityQueue.poll();
    }
    private static HashMap<Character, String> generateHuffmanCodes(HuffmanNode root) {
        HashMap<Character, String> huffmanCodes = new HashMap<>();
        generateHuffmanCodesHelper(root, "", huffmanCodes);
        return huffmanCodes;
    }
    private static void generateHuffmanCodesHelper(HuffmanNode root, String code, HashMap<Character, String> huffmanCodes) {//helps to provide values to huffman tree
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.data, code);
        }
        generateHuffmanCodesHelper(root.left, code + "0", huffmanCodes);
        generateHuffmanCodesHelper(root.right, code + "1", huffmanCodes);
    }
}
