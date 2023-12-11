/* java graph Course problem make use of topological sorting 
description:

if the graph didnt consist cycle its true 
else false

ex:
{1, 0}, {2, 0} here 1 occurs before 2 therefore its true 
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Graph {
        private int V;
        private ArrayList<Integer>[] adjList;

        public Graph(int V) {
            this.V = V;
            adjList = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        public void addEdge(int source, int destination) {
            adjList[source].add(destination);
        }
    }

    static boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph graph = new Graph(numCourses);
        for (int[] prerequisite : prerequisites) {
            graph.addEdge(prerequisite[1], prerequisite[0]);
        }
        int[] inDegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            inDegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph.adjList[current]) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        for (int degree : inDegree) {
            if (degree > 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 1}};
        System.out.println(canFinish(numCourses, prerequisites));
    }
}
