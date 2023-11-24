class Main {
    private static Listnode head;
    private static Listnode tail;
    private static int length;

    static class Listnode {
        private int data;
        private Listnode next;
        private Listnode previous;

        public Listnode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public Main() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void insertAtEnd(int data) {
        Listnode newNode = new Listnode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

        length++;
    }
    public static void main(String[] args) {
        Main doublyLL = new Main();

        doublyLL.insertAtEnd(1);
        doublyLL.insertAtEnd(2);
        doublyLL.insertAtEnd(3);
    }
}
