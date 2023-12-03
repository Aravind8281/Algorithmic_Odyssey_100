import java.util.*;

public class Tree {
    private static Treenode root;
    private static int diameter = 0;

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

    static void Flatten(Treenode root) {
        Treenode current = root;
        while (current != null) {
            if (current.left != null) {
                Treenode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            System.out.print(current.data + " ");
            current = current.right;
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
        Flatten(root);
    }
}
