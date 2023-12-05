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
    public static void main(String[] args) {
        Tree tr = new Tree();
        tr.root = tr.push(tr.root, 5);
        tr.push(tr.root, 3);
        tr.push(tr.root, 7);
    }
}
