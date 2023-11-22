import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;

class Main {
    Deque<Integer> dq;
    HashSet<Integer> set;

    Main() {
        dq = new LinkedList<>();
        set = new HashSet<>();
    }

    void refer(int page, int capacity) {
        if (!set.contains(page)) {
            if (dq.size() == capacity) {
                int last = dq.removeLast();
                set.remove(last);
            }
        } else {
            dq.remove(page);
        }
        dq.push(page);
        set.add(page);
    }

    void display() {
        Iterator<Integer> itr = dq.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        Main lruCache = new Main();  
        lruCache.refer(1, 4);
        lruCache.refer(2, 4);
        lruCache.refer(3, 4);
        lruCache.refer(1, 4);
        lruCache.refer(4, 4);
        lruCache.refer(5, 4);
        lruCache.display();
    }
}
