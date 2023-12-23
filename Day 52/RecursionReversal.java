class Main {
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

    static Listnode reverse(Listnode current) {
        if (current == null || current.next == null) {
            return current;
        }

        Listnode restReversed = reverse(current.next);
        current.next.next = current;
        current.next = null;//to avoid cyclic dependcy
        return restReversed;
    }

    public static void main(String[] args) {
        head = new Listnode(3);
        head.next = new Listnode(4);
        head.next.next = new Listnode(5);
        head.next.next.next = new Listnode(6);

        display();

        head = reverse(head);
        display();
    }
}
