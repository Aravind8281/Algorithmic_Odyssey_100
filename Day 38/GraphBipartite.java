//Graph with even cycle is bipartite
//Graph with odd cycle is not bipartite
//Linear Graph is Bipartite 

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

    static boolean check(int start, LinkedList<Integer>[] adjMatrix, int color[]) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int ad : adjMatrix[node]) {
                if (color[ad] == -1) {
                    color[ad] = 1 - color[node];
                    q.offer(ad);
                } else if (color[ad] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isBipartite(int size) {
        int[] color = new int[size];
        Arrays.fill(color, -1);
        for (int i = 0; i < size; i++) {
            if (color[i] == -1) {
                if (!check(i, graph.adjMatrix, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        System.out.print(isBipartite(5));
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
