public class Main{
    private static Listnode head;
    static class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    static int Count(){
        int count=0;
        Listnode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    static int findmid(){
        int mid=Count()/2;
        Listnode current=head;
        for(int i=0;i<mid;i++){
            current=current.next;
        }
        return (int)current.data;
    }
    public static void main(String[] args){
        Main sll=new Main();
        head=new Listnode(1);
        Listnode second=new Listnode(2);
        Listnode third=new Listnode(3);
        Listnode fourth=new Listnode(4);
        Listnode five=new Listnode(5);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        System.out.print(findmid());
    }
}
