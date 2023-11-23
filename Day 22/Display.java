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

    static void display() {
        Listnode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Main sll = new Main();
        head = new Listnode(1);
        Listnode second = new Listnode(2);
        Listnode third = new Listnode(3);
        Listnode fourth = new Listnode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        display();
    }
}
