import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new LinkedList<>();
		System.out.print("Enter the Number of Elements to Insert :\n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int num=sc.nextInt();
		    q.add(num);
		}
		System.out.print(q);
		
	}
}
