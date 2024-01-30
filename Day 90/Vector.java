import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//Vector is like arraylist but it is thread safe 
		//Double the size of array which leads to immediate memory allocation when necessary
		List<Integer> fruit=new Vector<>();
		fruit.add(1);
		fruit.add(2);
		fruit.add(3);
		fruit.add(4);
		fruit.add(5);
		System.out.print(fruit);
	}
}
