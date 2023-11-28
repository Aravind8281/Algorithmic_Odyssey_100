public class Main{
	static class Node{
		int data;
		Node next;
		boolean visited;
		Node(int d){
			data = d;
			next = null;
			visited = false;
		}
	}
	
	static int IntersectNode(Node head1, Node head2){
	    Node temp=head1;
	    while(temp!=null){
	        temp.visited=true;
	        temp=temp.next;
	    }
	    temp=head2;
	    while(temp!=null){
	        if(temp.visited){
	            return temp.data;
	        }
	        else{
	            temp.visited=true;
	            temp=temp.next;
	        }
	        
	    }
	    return -1;
	}
	
	public static void main(String[] args){
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1.next.next.next.next.next = new Node(6);
		head1.next.next.next.next.next.next = new Node(7);
		Node head2 = new Node(10);
		head2.next = new Node(9);
		head2.next.next = new Node(8);
		head2.next.next.next = head1.next.next.next;
		System.out.print(IntersectNode(head1, head2));;
	}
}
