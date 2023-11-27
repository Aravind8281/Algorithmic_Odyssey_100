public class Main
{   private static Listnode head;
    private static Listnode tail;
    private static int length=0;
    static class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
            length++;
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
    static void BubbleSort(){
         if (head == null) {
            return;
        }
        boolean flag;
        Listnode current;
        Listnode temp = null;
        do {
            flag= false;
            current = head;
            while (current.next != temp) {
                if (current.data > current.next.data) {
                    int tempData = current.data;
                    current.data = current.next.data;
                    current.next.data = tempData;
                    flag = true;
                }
                current = current.next;
            }
            temp = current;
        } while (flag);
    }
	public static void main(String[] args) {
		Main sll=new Main();
		head=new Listnode(4);
		Listnode two=new Listnode(3);
		Listnode three=new Listnode(2);
		Listnode four=new Listnode(1);
		head.next=two;
		two.next=three;
		three.next=four;
		display();
		BubbleSort();
		display();
	}
}
