import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; ++i) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public boolean isCyclic() {
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < vertices; ++i) {
            if (!visited.contains(i) && isCyclicUtil(i, visited, -1)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCyclicUtil(int vertex, Set<Integer> visited, int parent) {
        visited.add(vertex);

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                if (isCyclicUtil(neighbor, visited, vertex)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        if (graph.isCyclic()) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}
