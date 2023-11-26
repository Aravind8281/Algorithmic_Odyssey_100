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

    static int findSquare(int n) {
        int square = 0;
        while (n != 0) {
            int rem = n % 10;
            square += rem * rem;
            n = n / 10;
        }
        return square;
    }

    static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = findSquare(n);
        }
        return n == 1;
    }

    static boolean HappyNumber() {
        Listnode current = head;
        while (current != null) {
            if (!isHappy(current.data)) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Main sll = new Main();
        head = new Listnode(19);
        Listnode second = new Listnode(82);
        Listnode third = new Listnode(68);
        Listnode fourth = new Listnode(100);
        head.next = second;
        second.next = third;
        third.next = fourth;
        display();

        boolean isHappyList = HappyNumber();
        System.out.println(isHappyList);
    }
}
