class Main{
    
    private static Listnode head;
    private int length;
    static class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
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
    }
}
