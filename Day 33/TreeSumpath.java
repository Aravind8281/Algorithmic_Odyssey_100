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

    static int SumNumbers(Treenode root){
        return helper(root,0);
    }
    static int helper(Treenode root,int sum){
        if(root==null){
            return 0;
        }
        sum=sum*10+root.data;
        if(root.left==null && root.right==null){
            return sum;
        }
        return helper(root.left,sum) + helper(root.right,sum);
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

        System.out.print(SumNumbers(root));
    }
}
