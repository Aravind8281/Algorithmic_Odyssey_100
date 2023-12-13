import java.util.*;

class Main {
    static class graph {
        private int v;
        private int e;
        private LinkedList<Integer>[] adj;

        public graph(int data) {
            this.v = data;
            this.e = 0;
            this.adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination) {
            adj[source].add(destination);
            adj[destination].add(source);
            e++;
        }

        static int MinimumNode(graph g, int start, int end) {
            Queue<Pair<Integer, Integer>> q = new LinkedList<>();
            q.add(new Pair<>(start, 0));
            LinkedList<Integer> dist = new LinkedList<>();
            for (int i = 0; i < 100000; i++) {
                dist.add((int) 1e9);
            }
            dist.set(start, 0);
            int mod = 100000;

            while (!q.isEmpty()) {
                int node = q.peek().getKey();
                int steps = q.poll().getValue();

                for (int i : g.adj[node]) {
                    int num = (i * node) % mod;
                    if (steps + 1 < dist.get(num)) {
                        if (num == end) {
                            return steps + 1;
                        }
                        q.add(new Pair<>(num, steps + 1));
                    }
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            graph g = new graph(5);
            g.addEdge(0, 1);
            g.addEdge(1, 2);
            g.addEdge(3, 4);
            int start = 0;
            int end = 4;
            System.out.println(MinimumNode(g, start, end));
        }
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
