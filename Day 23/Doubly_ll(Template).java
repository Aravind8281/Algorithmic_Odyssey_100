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

    public static void main (String[] args) {
        
    }
}
