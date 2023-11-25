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
    static void deleteFirst() {
        if (head == null)
            return;
        current = head;
        while (current.next != head) {
            current = current.next;
        }
        head = head.next;
        current.next = head;
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
        deleteFirst();
        display();
    }
    
}
