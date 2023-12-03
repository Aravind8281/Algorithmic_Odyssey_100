import java.util.*;

public class Tree {
    private static Treenode root;
    private static int count = 0;

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

    static Treenode KthSmallest(Treenode root,int target) {
        if(root==null){
            return null;
        }
        Treenode lefth=KthSmallest(root.left,target);
        if(lefth!=null){
            return lefth;
        }
        count++;
        if(count==target){
            return root;
        }
        return KthSmallest(root.right,target);
    }

    public static void main(String[] args) {
        Tree tr = new Tree();
        root = new Treenode(5);
        Treenode first = new Treenode(3);
        Treenode I_left = new Treenode(1);
        Treenode I_right = new Treenode(4);
        Treenode second = new Treenode(6);
        Treenode II_left = new Treenode(5);
        Treenode II_right = new Treenode(7);
        root.left = first;
        root.right = second;
        first.left = I_left;
        first.right = I_right;
        second.left = II_left;
        second.right = II_right;
        System.out.print(KthSmallest(root,3).data);
    }
}
