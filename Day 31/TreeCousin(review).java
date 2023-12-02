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

    static int level(Treenode node, Treenode target, int lev) {
        if (node == null) {
            return 0;
        }
        if (node == target) {
            return lev;
        }
        int l = level(node.left, target, lev + 1);
        if (l != 0) {
            return l;
        }
        return level(node.right, target, lev + 1);
    }

    static boolean isSibling(Treenode node, Treenode x, Treenode y) {
        if (node == null) {
            return false;
        }
        return ((node.left == x && node.right == y) || (node.left == y && node.right == x)
                || isSibling(node.left, x, y) || isSibling(node.right, x, y));
    }

    static Treenode findNode(Treenode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.data == val) {
            return node;
        }
        Treenode found = findNode(node.left, val);
        if (found != null) {
            return found;
        }
        return findNode(node.right, val);
    }

    static boolean areCousins(int x, int y) {
        Treenode nodeX = findNode(root, x);
        Treenode nodeY = findNode(root, y);

        if (nodeX == null || nodeY == null) {
            return false; // One or both nodes not found in the tree
        }

        return (level(root, nodeX, 0) == level(root, nodeY, 0) && !isSibling(root, nodeX, nodeY));
    }

    public static void main(String[] args) {
        Tree tr = new Tree();
        root = new Treenode(1);
        Treenode first = new Treenode(2);
        Treenode I_left = new Treenode(3);
        Treenode I_right = new Treenode(4);
        Treenode second = new Treenode(5);
        Treenode II_left = new Treenode(6);
        Treenode II_right = new Treenode(7);

        root.left = first;
        root.right = second;
        first.left = I_left;
        first.right = I_right;
        second.left = II_left;
        second.right = II_right;

        System.out.print(areCousins(3, 7));
    }
}
