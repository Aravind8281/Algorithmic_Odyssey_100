import java.util.*;

class Main {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int BinarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

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

    static int Rotatedcount(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,0,1,2,3};
        PrintArray(arr);
        System.out.print(Rotatedcount(arr)+1);
    }
}
