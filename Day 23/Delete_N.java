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
    static void Delete_N(int target){
        Listnode current=head;
        for(int i=0;i<target-2 && current!=null;i++){
            current=current.next;
        }
        Listnode once_ahead=current.next.next;
        current.next=once_ahead;
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
        Listnode third=new Listnode(3);
        Listnode fourth=new Listnode(4);
        Listnode fifth=new Listnode(5);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        display();
        Delete_N(4);
        display();
    }
}
