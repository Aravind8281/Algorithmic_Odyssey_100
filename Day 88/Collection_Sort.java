import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        Collections.sort(names);
        System.out.print(names);
	}
}
