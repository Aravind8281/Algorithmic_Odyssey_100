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
    static void Delete_Last(){
        Listnode current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    static void display(){
        Listnode current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static boolean Search(int target) {
        Listnode current = head;
        while (current != null) {
            if (current.data == target)
                return true;
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args){
        Main sll=new Main();
        head=new Listnode(1);
        Listnode second=new Listnode(2);
        Listnode third=new Listnode(2);
        Listnode fourth=new Listnode(3);
        head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.print(Search(2));
        //true
    }
}
