//Node without cycle and Node which is terminal itself is SafeNode

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

        public boolean dfs(int node, LinkedList<Integer>[] adj, int[] vis, int[] path) {
            vis[node] = 1;
            path[node] = 1;

            for (int i : adj[node]) {
                if (vis[i] == 0) {
                    if (dfs(i, adj, vis, path)) {
                        return true;
                    }
                } else if (path[i] == 1) {
                    return true;
                }
            }

            path[node] = 0;
            return false;
        }
    }

    static LinkedList<Integer> SafeNode(graph g) {
        int[] vis = new int[g.v];
        Arrays.fill(vis, 0);
        int[] pathvisit = new int[g.v];
        Arrays.fill(pathvisit, 0);
        int[] check = new int[g.v];
        Arrays.fill(check, 0);
        LinkedList<Integer> safenodes = new LinkedList<>();

        for (int i = 0; i < g.v; i++) {
            if (vis[i] == 0) {
                if (!g.dfs(i, g.adj, vis, pathvisit)) {
                    check[i] = 1;
                    safenodes.add(i);
                }
            }
        }
        return safenodes;
    }

    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        System.out.println(SafeNode(g));
    }
}
