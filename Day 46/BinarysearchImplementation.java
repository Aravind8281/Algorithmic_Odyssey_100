import java.util.*;
class Main{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int BinaryArray(int[] arr,int target){
       int low = 0;
        int high = arr.length - 1;
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
        int[] arr={1,2,3,4,5,6,7,8};
        PrintArray(arr);
        System.out.print(BinaryArray(arr,3));
    }
}
