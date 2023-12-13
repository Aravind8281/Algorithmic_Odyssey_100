// This problem deals with returning no of graphs using BFS or DFS

import java.util.*;

class Main {
    static class graph {
        private int v;
        private int e;
        private LinkedList<Integer>[] adj;

        public graph(int data) {
            this.v = data;
            this.e = 0;
            this.adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }
        public void addEdge(int source, int destination) {
            adj[source].add(destination);
            adj[destination].add(source);
            e++;
        }
        public void dfs(int node, int[] vis) {
            vis[node] = 1;
            for (int i : adj[node]) {
                if (vis[i] == 0) {
                    dfs(i, vis);
                }
            }
        }
    }

    static int No_Of_provinces(graph g) {
        int[] vis = new int[g.v];
        Arrays.fill(vis, 0);
        int count = 0;
        for (int i = 0; i < g.v; i++) {
            if (vis[i] == 0) {
                count++;
                g.dfs(i, vis);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        System.out.println(No_Of_provinces(g));
    }
}
