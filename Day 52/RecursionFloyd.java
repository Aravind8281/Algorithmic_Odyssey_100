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

    static void display(Listnode head) {
        Listnode current = head;
        while (current != null) {
            System.out.print(current.data + "   ");
            current = current.next;
        }
        System.out.println();
    }

    static boolean Floyd(Listnode slowptr, Listnode fastptr) {
        if (slowptr == null || fastptr == null || fastptr.next == null) {
            return false;
        }

        if (slowptr.data == fastptr.data) {
            return true;
        }

        return Floyd(slowptr.next, fastptr.next.next);
    }

    public static void main(String[] args) {
        head = new Listnode(3);
        head.next = new Listnode(4);
        head.next.next = new Listnode(5);
        head.next.next.next = new Listnode(6);
        head.next.next.next.next = new Listnode(6);
        
        System.out.print(Floyd(head, head.next));
    }
}
