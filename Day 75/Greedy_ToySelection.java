import java.util.*;
public class Main
{
    static int toySelection(int[] a,int k,int n){
        int toys=0;
        for(int i=0;i<n;i++){
            if(a[i]<k){
                toys++;
                k-=a[i];
            }
        }
        return toys;
    }
	public static void main(String[] args) {
		int[] start={1,12,5,111,200,1000,10};
		System.out.print(toySelection(start,50,7));
	}
}
