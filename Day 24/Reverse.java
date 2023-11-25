public class Reverse {
    private static Listnode head;

    static class Listnode {
        private int data;
        private Listnode next;

        public Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void display() {
        Listnode current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }

    static void reverse() {
        Listnode current = head;
        Listnode next = null;
        Listnode previous = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        Reverse sll = new Reverse();
        head = new Listnode(1);
        Listnode second = new Listnode(2);
        Listnode third = new Listnode(3);
        Listnode fourth = new Listnode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        display();
        reverse();
        display();
    }
}
