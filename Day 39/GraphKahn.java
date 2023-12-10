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
        graph.E++;
    }

    static int[] toposort(int V, LinkedList<Integer>[] adjMatrix) {
        int[] indegree = new int[V];
        Queue<Integer> q = new LinkedList<>();
        int[] result = new int[V];
        int index = 0;

        // Calculate indegree for each vertex
        for (int i = 0; i < V; i++) {
            for (int j : adjMatrix[i]) {
                indegree[j]++;
            }
        }

        // Enqueue vertices with indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            result[index++] = node;

            for (int neighbor : adjMatrix[node]) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }

        return result;
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
