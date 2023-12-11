/*Problem Statement:

Suppose you are given a sorted dictionary of words in an alien language. The dictionary is represented as an array of strings, where the words are sorted lexicographically. However, the order of characters in this alien language is different from the order in the English alphabet. You need to find and return the order of characters in this alien language.

Example:

Consider the following dictionary:

css

["caa", "aaa", "aab"]

From this dictionary, we can deduce the following character order:

css

c, a, b

Explanation:

    From the first two words, "caa" and "aaa," we can determine that 'c' comes before 'a' in the alien language.

    From the last two words, "aaa" and "aab," we can determine that 'a' comes before 'b' in the alien language.
    
*/


import java.util.*;

public class Graph {
    private static GraphNode graph;

    private static class GraphNode {
        private int V;
        private int E;
        private LinkedList<Integer>[] adjMatrix;

        public GraphNode(int data) {
            this.V = data;
            this.E = 0;
            this.adjMatrix = new LinkedList[data];
            for (int i = 0; i < data; i++) {
                this.adjMatrix[i] = new LinkedList<>();
            }
        }
    }
    private static int[] vis;
    private static Stack<Integer> st = new Stack<>();
    private static String ans = "";
    static void dfs(int node, int[] vis, Stack<Integer> st, List<List<Integer>> adjList) {
        vis[node] = 1;

        for (int neighbor : adjList.get(node)) {
            if (vis[neighbor] == 0) {
                dfs(neighbor, vis, st, adjList);
            }
        }

        st.push(node);
    }

    static String findOrder(String[] dict, int V) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < V - 1; i++) {
            String s1 = dict[i];
            String s2 = dict[i + 1];
            int len = Math.min(s1.length(), s2.length());
            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    list.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }
        vis = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, list);
            }
        }

        while (!st.isEmpty()) {
            ans += (char) (st.pop() + 'a');
        }

        return ans;
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);

        String[] dict = {"caa", "aaa", "aab"};
        int V = dict.length;
        String result = findOrder(dict, V);
        System.out.println(result);
    }
    static void addEdge(int V, int E) {
        graph.adjMatrix[V].add(E);
        graph.adjMatrix[E].add(V);
        graph.E++;
    }
}
