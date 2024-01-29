import java.util.*;
public class Main
{
    static int div(int a,int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("not suitable");
        } 
        return a/b;
    }
	public static void main(String[] args) {
		int a=10,b=0;
	    try{ 
	        System.out.print(div(a,b));
	    }catch(Exception e){
	        System.out.print(e.getMessage());
	    }
	}
}
