public class Main {
    private static Listnode head;
    private static Listnode tail;
    private static int length = 0;

    static class Listnode {
        private int data;
        private Listnode next;

        public Listnode(int data) {
            this.data = data;
            this.next = null;
            length++;
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

    static int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack Underflow");
        }
        return tail.data;
    }

    static boolean isEmpty() {
        return length == 0;
    }

    static void push(int data) {
        Listnode newNode = new Listnode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    static void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack Underflow");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Listnode current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }

        length--;
    }

    public static void main(String[] args) {
        Main sll = new Main();
        push(1);
        push(2);
        push(3);
        display();
        System.out.println("Peek: " + peek());
        push(4);
        display();
        pop();
        display();
    }
}
