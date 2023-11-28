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

    static Listnode K_swap(Listnode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        Listnode current = head;
        Listnode prev = null;
        int count = 0;
        Listnode temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (count == k) {
            count = 0;
            while (count < k && current != null) {
                Listnode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            if (current != null) {
                head.next = K_swap(current, k);
            }

            return prev;
        } else {
            count = 0;
            while (count < k && prev != null) {
                Listnode next = prev.next;
                prev.next = current;
                current = prev;
                prev = next;
                count++;
            }

            return current;
        }
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
        head = K_swap(head, 3);
        display();
    }
}
