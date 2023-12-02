import java.util.*;

public class Tree {
    private static Treenode root;

    static class Treenode {
        private Treenode left;
        private Treenode right;
        private int data;

        public Treenode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void BFS() {
        if (root == null) {
            return;
        }

        Queue<Treenode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                Treenode temp = q.poll();
                if (temp != null) {
                    levelSum += temp.data;
                    if (temp.left != null) {
                        q.offer(temp.left);
                    }

                    if (temp.right != null) {
                        q.offer(temp.right);
                    }
                }
            }
            if (levelSize > 0) {
                float average = (float) levelSum / levelSize;
                System.out.print(average + " ");
            }
        }
    }

    public static void main(String[] args) {
        Tree tr = new Tree();
        root = new Treenode(0);
        Treenode first = new Treenode(1);
        Treenode I_left = new Treenode(2);
        Treenode I_right = new Treenode(3);
        Treenode second = new Treenode(4);
        Treenode II_left = new Treenode(5);
        Treenode II_right = new Treenode(6);

        root.left = first;
        root.right = second;
        first.left = I_left;
        first.right = I_right;
        second.left = II_left;
        second.right = II_right;

        BFS();
    }
}
