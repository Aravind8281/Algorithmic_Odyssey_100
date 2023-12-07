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

    static void BFS(int size) {
        Boolean[] visited = new Boolean[size];
        Arrays.fill(visited, false);
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + "  ");
            for (Integer num : graph.adjMatrix[u]) {
                if (!visited[num]) {
                    q.offer(num);
                    visited[num] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        BFS(5);
    }
}
