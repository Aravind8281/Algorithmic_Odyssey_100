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
    static int ans=Integer.MIN_VALUE;
    static int PathSum(){
        helper(root);
        return ans;
    }
    static int helper(Treenode root){
        if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int pathsum=left+right+root.data;
        ans=Math.max(ans,pathsum);
        return ans;
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
        System.out.print(PathSum());
    }
}

