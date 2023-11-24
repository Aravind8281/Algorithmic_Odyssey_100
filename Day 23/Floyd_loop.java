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
    static void display(){
        Listnode current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        
        System.out.println();
    }
    static boolean Is_looped(){
        Listnode slow_ptr=head;
        Listnode fast_ptr=head;
        while(slow_ptr!=null && fast_ptr!=null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            if(slow_ptr==fast_ptr){
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        Main ll=new Main();
        head=new Listnode(1);
        Listnode second=new Listnode(2);
        Listnode third=new Listnode(3);
        Listnode fourth=new Listnode(4);
        Listnode five =new Listnode(5);
        Listnode six=new Listnode(6);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        five.next=six;
        six.next=third;
        if(!Is_looped()){
            display();
        }
        else
            System.out.print("LinkedList is Looped Infinitely !!!");
    }
    
}
