class Main{
    
    private static Listnode head;
    private static int length;
    private static Listnode current;
    static class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void display() {
        current = head;
        do {
            System.out.print(current.data + "   ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    static void DeleteLast(){
        current=head;
        if(head==null)
            return;
        do{
            current=current.next;
        }while(current.next.next!=head);
        Listnode temp=current;
        current.next=null;
        temp.next=head;
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
        fourth.next=head;
        display();
        DeleteLast();
        display();
    }
    
}
