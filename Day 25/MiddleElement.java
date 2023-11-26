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
    static void display(){
        Listnode current=head;
        while(current!=null){
            System.out.print(current.data+"   ");
            current=current.next;
        }
        System.out.println();
    }
   static void middle() {
        Listnode slow = head;
        Listnode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);
    }
    public static void main (String[] args) {
        Main sll=new Main();
        head=new Listnode(1);
        Listnode second=new Listnode(2);
        Listnode third=new Listnode(3);
        Listnode fourth=new Listnode(4);
        head.next=second;
        second.next=third;
        third.next=fourth;
        display();
        middle();
    }
}
