import java.util.*;
public class Main
{
    static void rotateArray(int[] arr){
        int n=arr.length;
        int[] b=new int[n];
        b[0]=arr[n-1];
        for(int i=0;i<n-1;i++){
            b[i+1]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
        
    }
	public static void main(String[] args) {
	    int[] arr={1,2,3,4,5,6,7};
	    rotateArray(arr);
	}
}
