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
    static int get(int data){
        Listnode current=head;
        for(int i=0;i<data-1;i++){
            current=current.next;
        }
        return (int)current.data;
    }
    public static void main(String[] args){
        Main sll=new Main();
        head=new Listnode(1);
        Listnode second=new Listnode(5);
        Listnode third=new Listnode(2);
        Listnode fourth=new Listnode(3);
        head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.print(get(2));
    }
}
