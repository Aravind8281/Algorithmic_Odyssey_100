public class Main {
    private static Listnode front;
    private static Listnode rear;
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
        Listnode current = front;
        while (current != null) {
            System.out.print(current.data + "   ");
            current = current.next;
        }
        System.out.println();
    }

    static int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow");
        }
        return front.data;
    }

    static boolean isEmpty() {
        return length == 0;
    }

    static void enqueue(int data) {
        Listnode newNode = new Listnode(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }

    static void dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow");
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }

        length--;
    }

    public static void main(String[] args) {
        Main queue = new Main();
        enqueue(1);
        enqueue(2);
        enqueue(3);
        display();
        enqueue(4);
        display();
        dequeue();
    }
}
