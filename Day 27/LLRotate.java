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
            System.out.print(current.data + "    ");
            current = current.next;
        }
        System.out.println();
    }

    static void rotate(int k) {
         if (k <= 0 || head == null) {
            return;
        }
        Listnode current = head;
        int count = 1;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        k = k % count;
        if (k == 0) {
            return;
        }
        current = head;
        for (int i = 1; i < count - k; i++) {
            current = current.next;
        }
        Listnode newHead = current.next;
        current.next = null;
        current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        head = newHead;
        
    }

    public static void main(String[] args) {
        Main sll = new Main();
        head = new Listnode(1);
        Listnode second = new Listnode(2);
        Listnode third = new Listnode(3);
        Listnode fourth = new Listnode(4);
        Listnode fifth = new Listnode(5);
        Listnode six = new Listnode(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        display();
        rotate(3);
        display();
    }
}
