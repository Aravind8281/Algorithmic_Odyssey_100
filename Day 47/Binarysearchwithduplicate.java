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

    static int SearchRotatedArray(int[] arr, int target) {
        int peak = pivot(arr);
        if (peak == -1) {
            return BinarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[peak] == target) {
            return peak;
        }
        if (target >= arr[0]) {
            return BinarySearch(arr, target, 0, peak - 1);
        }
        return BinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int pivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            } 
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid]==arr[low] && arr[mid] == arr[high]){
                if(arr[low]>arr[low+1]){
                    return low;
                }
                low++;
                if(arr[high]<arr[high-1]){
                    return high-1;
                }
                high--;
            }
            else if(arr[mid]>arr[low] || (arr[low]==arr[mid] && arr[mid] > arr[high])){
                low=mid+1;
            }
            else{
                
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        PrintArray(arr);
        System.out.print(SearchRotatedArray(arr, 2));
    }
}
