import java.util.*;

class Tree {
    private static Treenode root;

    public static class Treenode {
        private int data;
        private Treenode left;
        private Treenode right;

        public Treenode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Treenode ArraytoBst(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Treenode newNode = new Treenode(arr[mid]);
        newNode.left = ArraytoBst(arr, start, mid - 1);
        newNode.right = ArraytoBst(arr, mid + 1, end);
        return newNode;
    }

    static void preorder(Treenode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "   ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int end = arr.length - 1;
        root = ArraytoBst(arr, 0, end);
        preorder(root);
    }
}
