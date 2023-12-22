import java.util.*;

public class Main {
    static int Binarysearch(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                return Binarysearch(arr, target, mid + 1, end);
            } else {
                return Binarysearch(arr, target, start, mid - 1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 2;
        System.out.print(Binarysearch(arr, target, 0, arr.length - 1));
    }
}
