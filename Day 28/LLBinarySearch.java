public class Main {
    private static Listnode head;
    private static Listnode current;

    static class Listnode {
        private int data;
        private Listnode next;

        public Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void Display() {
        current = head;
        while (current != null) {
            System.out.print(current.data + "   ");
            current = current.next;
        }
        System.out.println();
    }

    static boolean BinarySearch(int target) {
        Listnode slow = head;
        Listnode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        while (slow != null) {
            if (slow.data == target) {
                System.out.println(slow.data + " Found");
                return true;
            } else if (slow.data < target) {
                slow = slow.next;
            } else {
                System.out.println("Element not found");
                return false;
            }
        }

        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        Main Sll = new Main();
        head = new Listnode(20);
        head.next = new Listnode(4);
        head.next.next = new Listnode(15);
        head.next.next.next = new Listnode(35);
        Display();
        BinarySearch(15);
    }
}
