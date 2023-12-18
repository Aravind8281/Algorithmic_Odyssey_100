import java.util.*;

class Main {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int BinarySearch(int[] arr, int m, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;

            int pieces = countPieces(arr, mid);

            if (pieces > m) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    static int countPieces(int[] arr, int targetSum) {
        int sum = 0;
        int pieces = 1;

        for (int i : arr) {
            if (sum + i > targetSum) {
                sum = i;
                pieces++;
            } else {
                sum += i;
            }
        }

        return pieces;
    }

    static int SplitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i : arr) {
            start = Math.max(start, i);
            end += i;
        }

        return BinarySearch(arr, m, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        PrintArray(arr);
        System.out.print(SplitArray(arr, m));
    }
}
