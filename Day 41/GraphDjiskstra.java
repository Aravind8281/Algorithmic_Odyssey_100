//Djisktra Algorithm deals with finding shortest path between source to vertex
//New Comparator.comparingInt(a -> a[0]): This part specifies the comparator that the PriorityQueue will use to determine the priority of elements. 
//Here, it uses a lambda expression to create a comparator that compares the elements based on the integer value at index 0 of each array (a[0]). 
//This means that the element with the smallest value at index 0 will have the highest priority.

import java.util.*;
class Graph {
    static LinkedList<Integer> dijkstra(int n, List<int[]>[] adj, int S) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        LinkedList<Integer> ans = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            ans.add(Integer.MAX_VALUE);
        }

        ans.set(S, 0);
        pq.add(new int[]{0, S});

        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            int dis = pair[0];
            int node = pair[1];

            for (int[] i : adj[node]) {
                int edge = i[1];
                int adjNode = i[0];

                if (dis + edge < ans.get(adjNode)) {
                    ans.set(adjNode, dis + edge);
                    pq.add(new int[]{ans.get(adjNode), adjNode});
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<int[]>[] adj = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new LinkedList<>();
        }
        adj[0].add(new int[]{1, 1});
        adj[1].add(new int[]{0, 1});
        adj[1].add(new int[]{2, 2});
        adj[2].add(new int[]{1, 2});
        adj[2].add(new int[]{0, 3});
        adj[0].add(new int[]{2, 4});
        adj[1].add(new int[]{3, 5});
        adj[3].add(new int[]{1, 5});
        adj[3].add(new int[]{4, 1});
        adj[4].add(new int[]{3, 1});
        System.out.println(dijkstra(n, adj,0));
    }
}
