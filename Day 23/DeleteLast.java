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
    
    public void insertAtFirst(int data) {
        Listnode newNode = new Listnode(data);
    
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    
        length++;
    }
    public static void display() {
        Listnode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    static void delete_last(){
        Listnode current=tail;
        tail=current.previous;
        tail.next=null;
    }
    public static void main (String[] args) {
        Main doublyLL = new Main();

        doublyLL.insertAtFirst(3);
        doublyLL.insertAtFirst(2);
        doublyLL.insertAtFirst(1);
        display();
        delete_last();
        display();
    }
}
