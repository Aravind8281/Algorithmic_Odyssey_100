//Aim is to find where the graph breakdown into two or more graphs which is an articulationn point

import java.util.LinkedList;
import java.util.List;

class Graph {
    static void dfs(int node, int parent, int[] vis, int[] tim, int[] low, int[] mark, List<Integer>[] adj) {
        int time = 0;
        vis[node] = 1;
        tim[node] = low[node] = time;
        time++;
        int child = 0;

        for (int i : adj[node]) {
            if (i == parent) continue;

            if (vis[i] == 0) {
                dfs(i, node, vis, tim, low, mark, adj);
                low[node] = Math.min(low[node], low[i]);

                if (low[i] == tim[node] && parent != -1) {
                    mark[node] = 1;
                }

                child++;
            } else {
                low[node] = Math.min(low[node], tim[i]);
            }
        }

        if (child > 1 && parent == -1) {
            mark[node] = 1;
        }
    }

    static List<Integer> articulation(int n, List<Integer>[] adj) {
        int[] vis = new int[n];
        int[] tim = new int[n];
        int[] low = new int[n];
        int[] mark = new int[n];

        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(i, -1, vis, tim, low, mark, adj);
            }
        }

        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                ans.add(i);
            }
        }

        if (ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
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
        System.out.println(articulation(n, adj));
    }
}
