public class Main {
    private static Listnode head1;
    private static Listnode head2;
	private static Listnode current;
	static class Listnode{
	    private int data;
	    private Listnode next;
	    public Listnode(int data){
	        this.data=data;
	        this.next=null;
	    }
	}
    static int findIntersection() {
        int len1 = getLength(head1);
        int len2 = getLength(head2);
        int diff = Math.abs(len1 - len2);
        Listnode current1 = head1;
        Listnode current2 = head2;
        if (len1 > len2) {
            for (int i = 0; i < diff; i++) {
                current1 = current1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                current2 = current2.next;
            }
        }
        while (current1 != null && current2 != null) {
            if (current1 == current2) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return 0;
    }
    static int getLength(Listnode list) {
        int length = 0;
        Listnode current = list;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
    public static void main(String[] args) {
        Main sll1 = new Main();
        head1 = new Listnode(3);
        head1.next = new Listnode(6);
        head1.next.next = new Listnode(9);
        head1.next.next.next = new Listnode(15);
        head1.next.next.next.next = new Listnode(30);
        Main sll2 = new Main();
        head2 = new Listnode(10);
        head2.next = head1.next.next.next;
        System.out.print(findIntersection());
    }
}
