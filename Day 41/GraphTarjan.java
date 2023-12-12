import java.util.*;

class Graph {
    static void dfs(int node, int parent, int[] vis, int[] tim, int[] low, List<Integer>[] adj, List<List<Integer>> ans) {
        int time = 0;
        vis[node] = 1;
        tim[node] = low[node] = time;
        time++;
        int child = 0;

        for (int i : adj[node]) {
            if (i == parent) continue;

            if (vis[i] == 0) {
                dfs(i, node, vis, tim, low, adj, ans);
                low[node] = Math.min(low[node], low[i]);

                if (low[i] <= tim[node]) {
                    ans.add(Arrays.asList(node, i));
                }

                child++;
            } else {
                low[node] = Math.min(low[node], tim[i]);
            }
        }
    }

    static List<List<Integer>> tarjans(int n, List<Integer>[] adj) {
        int[] vis = new int[n];
        int[] tim = new int[n];
        int[] low = new int[n];
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(i, -1, vis, tim, low, adj, result);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<Integer>[] adj = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new LinkedList<>();
        }
        adj[0].add(1);
        adj[1].add(0);
        adj[1].add(2);
        adj[2].add(1);
        adj[2].add(0);
        adj[0].add(2);
        adj[1].add(3);
        adj[3].add(1);
        adj[3].add(4);
        adj[4].add(3);
        System.out.println(tarjans(n, adj));
    }
}
