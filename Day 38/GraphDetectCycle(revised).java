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

    static boolean DetectCycle(int size, LinkedList<Integer>[] adjMatrix) {
        int[] vis = new int[size];
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (vis[i] == 0) {
                q.offer(new Pair<>(i, -1));
                while (!q.isEmpty()) {
                    int r = q.peek().first;
                    int c = q.peek().second;
                    q.poll();
                    for (int adjacent : adjMatrix[r]) {
                        if (vis[adjacent] == 0) {
                            vis[adjacent] = 1;
                            q.offer(new Pair<>(adjacent, r));
                        } else if (c != adjacent) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    static boolean iscycle(int V, LinkedList<Integer>[] adj) {
        int[] vis = new int[V];
        return DetectCycle(V, adj);
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        System.out.print(iscycle(graph.V, graph.adjMatrix));
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
