import java.util.*;

public class Graph {
    private static GraphNode graph;
    private static int[][] visited;

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

    static void RottenOrange(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 2) {
                    q.offer(new Pair<>(i, j));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }
            }
        }
        int tm = 0;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().second;
            tm = Math.max(tm, t);
            q.poll();
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && matrix[nrow][ncol] == 1) {
                    matrix[nrow][ncol] = 2;
                    visited[nrow][ncol] = visited[r][c] + 1;
                    q.offer(new Pair<>(nrow, ncol));
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
        int[][] matrix = {
                {0, 1, 2},
                {0, 1, 1},
                {2, 1, 1}
        };
        visited = new int[matrix.length][matrix[0].length];

        RottenOrange(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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
