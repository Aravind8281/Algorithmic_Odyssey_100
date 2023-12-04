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
    static ArrayList<String> Serialize(Treenode root){
        ArrayList<String> list=new ArrayList<>(); 
        helper(root,list);
        return list;
    }
    static void helper(Treenode root,ArrayList<String> list){
        if(root==null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.data));
        helper(root.left,list);
        helper(root.right,list);
    }
    public static void main (String[] args) {
        Tree tr=new Tree();
        root=new Treenode(0);
        Treenode first=new Treenode(1);
        Treenode I_left=new Treenode(2);
        Treenode I_right=new Treenode(3);
        Treenode second=new Treenode(4);
        Treenode II_left=new Treenode(5);
        Treenode II_right=new Treenode(6);
        root.left=first;
        root.right=second;
        first.left=I_left;
        first.right=I_right;
        second.left=II_left;
        second.right=II_right;
        System.out.print(Serialize(root));
    }
}
