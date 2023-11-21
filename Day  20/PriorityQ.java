import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.offer(5);
		q.offer(2);
		q.offer(5);
		q.offer(4);
		q.offer(1);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.offer(0);
		System.out.println(q);
		PriorityQueue<String> sq=new PriorityQueue<>();
		sq.offer("zeus");
		sq.offer("tony");
		sq.offer("aravind");
		sq.offer("geralt");
		sq.offer("cavil");
		System.out.println(sq);
	}
}
/*A priority queue is a type of queue that arranges elements based on their priority values. 
Elements with higher priority values are typically retrieved before elements with lower priority values.
*/
