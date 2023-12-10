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

    static void addEdge(int V, int E) {
        graph.adjMatrix[V].add(E);
        graph.adjMatrix[E].add(V);
        graph.E++;
    }

    static void dfs(int node, int[] vis, Stack<Integer> st, LinkedList<Integer>[] adjMatrix) {
        vis[node] = 1;
        for (int i : adjMatrix[node]) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adjMatrix);
            }
        }
        st.push(node);
    }

    static int[] toposort(int V, LinkedList<Integer>[] adjMatrix) {
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adjMatrix);
            }
        }
        int[] ans = new int[V];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        int[] result = toposort(graph.V, graph.adjMatrix);
        for (int node : result) {
            System.out.print(node + " ");
        }
    }

    private static class Pair<A, B> {
        A first;
        B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
}
