import java.util.HashMap;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer> name=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Members :");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
		    String name1=sc.nextLine();
		    name.put(name1,count++);
		}
		System.out.print("Names "+ name);
	}
}
