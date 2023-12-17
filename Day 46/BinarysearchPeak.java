// Return point where element start decreasing

import java.util.*;
class Main{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int PeakMountain(int[] arr){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while (low < high) { 
            mid = low + (high - low) / 2; 
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return arr[low];  
    }
    public static void main (String[] args) {
        int[] arr={1,2,3,4,5,6,4,3,2};
        PrintArray(arr);
        System.out.print(PeakMountain(arr));
    }
}
