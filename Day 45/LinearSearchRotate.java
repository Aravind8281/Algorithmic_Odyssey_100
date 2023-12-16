import java.util.*;

class Main {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void RotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        while (k > 0) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        PrintArray(arr);

        RotateArray(arr, 3);
        PrintArray(arr);
    }
}
