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

    static Treenode LowestCommonAncestor(Treenode root, Treenode p, Treenode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        Treenode left = LowestCommonAncestor(root.left, p, q);
        Treenode right = LowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }

    public static void main(String[] args) {
        Tree tr = new Tree();
        root = new Treenode(5);
        Treenode first = new Treenode(2);
        Treenode I_left = new Treenode(1);
        Treenode I_right = new Treenode(3);
        Treenode second = new Treenode(3);
        Treenode II_left = new Treenode(6);
        Treenode II_right = new Treenode(8);
        root.left = first;
        root.right = second;
        first.left = I_left;
        first.right = I_right;
        second.left = II_left;
        second.right = II_right;
        Treenode result = LowestCommonAncestor(root, first, II_right);
        System.out.print(result.data);
    }
}
