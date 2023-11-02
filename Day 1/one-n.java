import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		oneN(n);
	}
	static void oneN(int n){
	    if(n<=0){
	        return;
	    }
	    System.out.println(n);
	    oneN(n-1);
	}
}

