import java.util.*;
public class Main
{   static void swap(int[] arr,int start,int end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    }
    static void CyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + "  ");
        }
    }
	public static void main(String[] args) {
		int[] arr={3,5,2,1,4};
		CyclicSort(arr);
	}
}
// when problem in range 1 to N apply cycylic sort
