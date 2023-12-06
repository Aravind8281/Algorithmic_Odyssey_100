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

    static void BoundryTraversal(){
        if(root==null){
            return;
        }
        helper_left(root);
        helper_right(root);
    }
    static void helper_left(Treenode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"  ");
        helper_left(root.left);
        
    }
    static void helper_right(Treenode root){
        if(root==null ){
            return;
        }
        helper_right(root.right);
        System.out.print(root.data+"  ");
        
    }
    public static void main(String[] args) {
        root=new Treenode(1);
        Treenode Left=new Treenode(2);
        Treenode Right=new Treenode(3);
        Treenode I_left=new Treenode(4);
        Treenode II_left=new Treenode(5);
        Treenode I_right=new Treenode(6);
        Treenode II_right=new Treenode(7);
        root.left=Left;
        root.right=Right;
        Left.left=I_left;
        Left.right=II_left;
        Right.left=I_right;
        Right.right=II_right;
        I_left.left=new Treenode(8);
        BoundryTraversal();
    }
}
