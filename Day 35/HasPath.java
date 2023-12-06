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
    static boolean HasPath(int[] arr){
        if(root==null){
            return arr.length==0;
        }
        return helper(root,arr,0);
    }
    static boolean helper(Treenode root,int[] arr,int index){
        if(root==null){
            return false;
        }
        if(index>=arr.length || root.data!=arr[index]){
            return true;
        }
        return helper(root.left, arr, index + 1) || helper(root.right, arr, index + 1);
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
        int[] arr={3,4,5};
        System.out.print(HasPath(arr));
    }
}
