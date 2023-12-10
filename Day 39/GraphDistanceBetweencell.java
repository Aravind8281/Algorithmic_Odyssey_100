//Java Nearest Cell problem is typically a Graph BFS problem which traverse through each of its neighbour node and do manipulation
// Nearest cell distance problem helps to find the Nearest cell distance
// traverse must in horizontal and vertical direction which means you cant move
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

    static void NearestCell(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] visited = new int[n][m];
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        
        // Initialize the queue with the cells with value 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    q.offer(new Pair<>(i, j));
                    visited[i][j] = 1;
                } else {
                    visited[i][j] = 0;
                }
            }
        }
        
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        
        while (!q.isEmpty()) {
            int r = q.peek().first;
            int c = q.peek().second;
            q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0) {
                    visited[nrow][ncol] = visited[r][c] + 1;
                    q.offer(new Pair<>(nrow, ncol));
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(visited[i][j] - 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 0, 1}
        };
        NearestCell(matrix);
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
