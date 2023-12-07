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
}
