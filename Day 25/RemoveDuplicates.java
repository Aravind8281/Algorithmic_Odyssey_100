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
            System.out.print(current.data + "   ");
            current = current.next;
        }
        System.out.println();
    }

    static void RemoveDuplicates() {
        Listnode current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Main sll = new Main();
        head = new Listnode(1);
        Listnode second = new Listnode(1);
        Listnode third = new Listnode(2);
        Listnode fourth = new Listnode(3);
        Listnode five = new Listnode(3);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;
        display();
        RemoveDuplicates();
        display();
    }
}
