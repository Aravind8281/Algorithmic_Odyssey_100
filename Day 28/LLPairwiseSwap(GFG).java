public class Main
{
	private static Listnode head;
	private static Listnode current;
	static class Listnode{
	    private int data;
	    private Listnode next;
	    public Listnode(int data){
	        this.data=data;
	        this.next=null;
	    }
	}
	static void Display(){
	    current=head;
	    while(current!=null){
	        System.out.print(current.data+"   ");
	        current=current.next;
	    }
	    System.out.println();
	}
	static void PairSwap(){
        Listnode temp = head;
        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
	}
	public static void main (String[] args) {
	    Main Sll=new Main();
	    head=new Listnode(20);
	    head.next=new Listnode(4);
	    head.next.next=new Listnode(15);
	    head.next.next.next=new Listnode(35);
	    Display();
	    PairSwap();
	}
}
