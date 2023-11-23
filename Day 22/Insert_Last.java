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
    static void Insert_Last(int last){
        Listnode temp=new Listnode(last);
        Listnode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=temp;
        
    }
    static void display(){
        Listnode current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Main sll=new Main();
        head=new Listnode(1);
        Listnode second=new Listnode(2);
        Listnode third=new Listnode(2);
        Listnode fourth=new Listnode(2);
        head.next=second;
        second.next=third;
        third.next=fourth;
        display();
        Insert_Last(4);
        display();
        //1 -> 2 -> 2 -> 2
        //1 -> 2 -> 2 -> 4
    }
}
