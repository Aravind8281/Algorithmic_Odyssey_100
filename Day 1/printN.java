import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		oneN(n);
	}
	static void oneN(int n){
	    int c=0;
	    helper(c,n);
	}
	static void helper(int c,int n){
	    if(c==n+1){
	        return;
	    }
	    System.out.println(c);
	    helper(c+1,n);
	}
}
