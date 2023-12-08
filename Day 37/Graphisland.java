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

    static int countIslands() {
        Boolean[] visited = new Boolean[graph.V];
        Arrays.fill(visited, false);
        int count = 0;

        for (int i = 0; i < graph.V; i++) {
            if (!visited[i]) {
                dfs(i, visited);
                count++;
            }
        }

        return count;
    }

    static void dfs(int i, Boolean[] visited) {
        visited[i] = true;
        for (int w : graph.adjMatrix[i]) {
            if (!visited[w]) {
                dfs(w, visited);
            }
        }
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);

        int numberOfIslands = countIslands();
        System.out.println("Number of Islands: " + numberOfIslands);
    }
}
