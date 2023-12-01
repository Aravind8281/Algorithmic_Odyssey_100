import java.util.*;
public class Tree{
    private static Treenode root;
    static class Treenode{
        private Treenode left;
        private Treenode right;
        private int data;
        public Treenode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int Minimum(Treenode root) {
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int result=root.data;
        int Ldata=Minimum(root.left);
        int Rdata=Minimum(root.right);
        if(result>Ldata){
            result=Ldata;
        }
        if(result>Rdata){
            result=Rdata;
        }
        return result;
        
    }

    public static void main (String[] args) {
        Tree tr=new Tree();
        root=new Treenode(1);
        Treenode first=new Treenode(2);
        Treenode I_left=new Treenode(3);
        Treenode I_right=new Treenode(4);
        Treenode second=new Treenode(5);
        Treenode II_left=new Treenode(6);
        Treenode II_right=new Treenode(7);
        root.left=first;
        root.right=second;
        first.left=I_left;
        first.right=I_right;
        second.left=II_left;
        second.right=II_right;
        System.out.print(Minimum(root));
    }
}
