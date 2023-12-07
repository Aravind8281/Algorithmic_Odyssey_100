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
            this.adjMatrix=new LinkedList[data];
            for (int i=0;i<data;i++){
                this.adjMatrix[i] = new LinkedList<>();
            } 
        }
    }
    static void addEdge(int V,int E){
        graph.adjMatrix[V].add(E);
        graph.adjMatrix[E].add(V);
        graph.E++;
    }
    public static void main (String[] args) {
        graph=new GraphNode(5);
        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(3,4);
        for (int i = 0; i < graph.V; i++) {
            System.out.print(i + " -> ");
            for (Integer neighbor : graph.adjMatrix[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
