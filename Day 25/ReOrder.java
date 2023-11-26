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

    static void ReOrder() {
        Listnode slow = head;
        Listnode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Listnode secondHalf = reverseList(slow);
        Listnode firstHalf = head;
        while (secondHalf != null) {
            Listnode nextFirst = firstHalf.next;
            Listnode nextSecond = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = nextFirst;
            firstHalf = nextFirst;
            secondHalf = nextSecond;
        }
        if (firstHalf != null) {
            firstHalf.next = null;
        }
    }


    static Listnode reverseList(Listnode node) {
        Listnode prev = null;
        Listnode current = node;
        Listnode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Main sll = new Main();
        head = new Listnode(1);
        Listnode second = new Listnode(2);
        Listnode third = new Listnode(3);
        Listnode fourth = new Listnode(4);
        Listnode fifth = new Listnode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        display();
        ReOrder();
        display();
    }
}
