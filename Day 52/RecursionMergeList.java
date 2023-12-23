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

    static Listnode mergeLists(Listnode A, Listnode B) {
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }

        Listnode result;
        if (A.data < B.data) {
            result = A;
            result.next = mergeLists(A.next, B);
        } else {
            result = B;
            result.next = mergeLists(A, B.next);
        }

        return result;
    }

    public static void main(String[] args) {
        head = new Listnode(3);
        head.next = new Listnode(4);
        head.next.next = new Listnode(5);
        head.next.next.next = new Listnode(6);

        Listnode head2 = new Listnode(7);
        head2.next = new Listnode(8);
        head2.next.next = new Listnode(9);

        Listnode mergedList = mergeLists(head, head2);
        display(mergedList);
    }
}
