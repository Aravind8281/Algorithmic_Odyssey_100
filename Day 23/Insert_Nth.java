class Main{
    private static Listnode head;
    static class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void insert_N(int data){
        Listnode temp=new Listnode(data);
        Listnode current=head;
        
        for (int i = 1; i < data - 1 && current != null; i++) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
    }
    static void display(){
        Listnode current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main (String[] args) {
        Main ll=new Main();
        head=new Listnode(1);
        Listnode second=new Listnode(2);
        Listnode third=new Listnode(4);
        Listnode fourth=new Listnode(5);
        head.next=second;
        second.next=third;
        third.next=fourth;
        display();
        insert_N(3);
        display();
    }
}
