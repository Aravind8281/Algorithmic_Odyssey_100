import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int element=0;
		for(int i=0;i<n;i++){
		    element=sc.nextInt();
		    stack.push(element);
		}
		for(Integer st:stack){
		    System.out.println(st);
		}
	}
}
