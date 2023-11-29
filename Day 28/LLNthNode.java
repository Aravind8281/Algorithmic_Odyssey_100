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
	static void NthNode(int data){
        current=head;
        int len=0;
        while(current!=null){
            current=current.next;
            len++;
        }
    
        current= head;
        if (data > len) {
            System.out.println("Invalid value of 'data'");
            return;
        }
        for (int i = 1; i < len - data + 1; i++)
            current = current.next;
        System.out.println(current.data);


	}
	public static void main (String[] args) {
	    Main Sll=new Main();
	    head=new Listnode(20);
	    head.next=new Listnode(4);
	    head.next.next=new Listnode(15);
	    head.next.next.next=new Listnode(35);
	    Display();
	    NthNode(2);
	}
}
