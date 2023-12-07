public class Graph {
    private static GraphNode graph;
    
    private static class GraphNode {
        private int V;
        private int E;
        private int[][] adjMatrix;
        
        public GraphNode(int data) {
            this.V = data;
            this.E = 0;
            this.adjMatrix = new int[data][data];
        }
    }
    
    static void addEdge(int v, int e) {
        graph.adjMatrix[v][e] = 1;
        graph.adjMatrix[e][v] = 1;
        graph.E++;
    }
    
    static void print(int ver) {
        for (int i = 0; i < ver; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < ver; j++) {
                System.out.print(graph.adjMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int numVertices = 5; 
        graph = new GraphNode(numVertices);
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        print(numVertices);
    }
}
