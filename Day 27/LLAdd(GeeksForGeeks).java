public class Main {
    private static Listnode head;

    static class Listnode {
        private int data;
        private Listnode next;

        public Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static int Add(Listnode list){
        if(head==null){
            return 0;
        }
        else{
            int num=0;
            Listnode current=head;
            while(current!=null){
                num=num*10+current.data;
                current=current.next;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Main sll = new Main();
        head = new Listnode(1);
        head.next=new Listnode(2);
        head.next.next=new Listnode(3);
        System.out.print(Add(head));
        
    }
}
