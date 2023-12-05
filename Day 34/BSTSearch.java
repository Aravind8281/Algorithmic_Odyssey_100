public class Tree {
    private Treenode root;

    static class Treenode {
        private Treenode left;
        private Treenode right;
        private int data;

        public Treenode(int data) {
            this.data = data;
        }
    }

    Treenode push(Treenode root, int value) {
        if (root == null) {
            return new Treenode(value);
        }
        if (value < root.data) {
            root.left = push(root.left, value);
        } else {
            root.right = push(root.right, value);
        }
        return root;
    }

    Boolean Search(Treenode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }

        if (target < root.data) {
            return Search(root.left, target);
        } else {
            return Search(root.right, target); 
        }
    }

    public static void main(String[] args) {
        Tree tr = new Tree();
        tr.root = tr.push(tr.root, 5);
        tr.push(tr.root, 3);
        tr.push(tr.root, 7);
        tr.push(tr.root, 4);
        tr.push(tr.root, 8);
        System.out.print(tr.Search(tr.root, 4));
    }
}
