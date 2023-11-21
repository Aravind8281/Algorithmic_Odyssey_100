import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Deque<Integer> de = new LinkedList<>();
		de.offerFirst(1);
		de.offerFirst(2);
		de.offerLast(3);
		de.offerLast(4);
		System.out.println(de);
		de.pollFirst();
		de.pollLast();
		System.out.println(de);
	}
}
