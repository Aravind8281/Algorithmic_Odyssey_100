// Special Sliding window algorithm used 
import java.util.*;
class Main{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int BinaryArray(int[] arr,int target,int low,int high){
        int mid;
        while (low <= high) { 
            mid = low + (high - low) / 2; 
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;  
    }
    public static void main (String[] args) {
        int[] arr={5,7,7,7,8,8,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
        PrintArray(arr);
        int start=0;
        int end=1;
        while(start<=end){
            if(BinaryArray(arr,17,start,end)!=-1){
                System.out.print(BinaryArray(arr,17,start,end));
                break;
            }
            else{
                start=end;
                end=end*2;
            }
        }
    }
}
