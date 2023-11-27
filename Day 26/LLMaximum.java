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
    static int maximum(){
        int max=head.data;
        if(head==null){
            System.out.print("List is Empty");
        }
        else{
            Listnode current=head.next;
            while(current.next!=null){
                if(current.data>max){
                    max=current.data;
                    current=current.next;
                }
                else{
                    current=current.next;
                }
            }
        }
        return max;
        
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
	    System.out.println(maximum());
	}
}
