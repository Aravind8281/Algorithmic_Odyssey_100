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

    static void floodFill(int[][] matrix, int startRow, int startCol, int targetColor, int newColor) {
        if (startRow < 0 || startRow >= matrix.length || startCol < 0 || startCol >= matrix[0].length || matrix[startRow][startCol] != targetColor) {
            return;
        }
        matrix[startRow][startCol]=newColor;
        int[][] directions={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int[] dir:directions){
            int newrow=startRow+dir[0];
            int newCol=startCol+dir[1];
            floodFill(matrix,newrow,newCol,targetColor,newColor);
        }
    }

    public static void main(String[] args) {
        graph = new GraphNode(5);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        int[][] matrix = {
            {0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0}
        };

        int targetColor = 1;
        int newColor = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == targetColor) {
                    floodFill(matrix, i, j, targetColor, newColor);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
