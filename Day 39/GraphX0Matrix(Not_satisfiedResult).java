// Java 0 X problem
// 2d Matrix consists of 0's and X.make zero X if all four side of 0's covered with X

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

    static void dfs(int r, int c, int[][] visited, char[][] matrix, int[] delrow, int[] delcol) {
        int n = matrix.length;
        int m = matrix[0].length;
        visited[r][c] = 1;

        for (int i = 0; i < 4; i++) {
            int nrow = r + delrow[i];
            int ncol = c + delcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && matrix[nrow][ncol] == '0') {
                dfs(nrow, ncol, visited, matrix, delrow, delcol);
            }
        }
    }

    static void X_OMatrix(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        int[][] visited = new int[n][m];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (matrix[i][j] == '0' &&
                        matrix[i - 1][j] == 'X' &&
                        matrix[i + 1][j] == 'X' &&
                        matrix[i][j - 1] == 'X' &&
                        matrix[i][j + 1] == 'X') {
                    matrix[i][j] = 'X';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && matrix[i][j] == '0') {
                    matrix[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "   ");
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
        char[][] matrix = {
                {'X', 'X', 'X', 'X'},
                {'X', '0', 'X', 'X'},
                {'X', '0', 'X', 'X'},
                {'X', 'X', '0', '0'}
        };
        X_OMatrix(matrix);
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
