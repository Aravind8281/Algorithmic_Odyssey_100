import java.util.*;
public class Main
{   static int SumofNatural(int sum){
        if(sum==0){
            return sum;
        }
        return sum+SumofNatural(sum-1);
    }
	public static void main(String[] args) {
		int sum=10;
		System.out.print(SumofNatural(sum));
	}
}
