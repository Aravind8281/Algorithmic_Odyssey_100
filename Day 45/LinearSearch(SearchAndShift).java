// input : 1,2,4,5,6,7,9
// output : 1,2,5,4,6,7,9
import java.util.*;
class Main{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void SearchandShift(int[] arr,int target){
        boolean found=false;
        int a=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                found=true;
                a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;
                break;
            }
            
        }
        PrintArray(arr);
    }
    public static void main (String[] args) {
        int[] arr={1,2,4,5,6,7,9};
        PrintArray(arr);
        SearchandShift(arr,4);
    }
}
