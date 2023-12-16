// Traverse through arrays and check for element
import java.util.*;
class Main {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static boolean ArraysEqual(int[] arr, int[] arr2) {
        Boolean[] flag1 = new Boolean[arr.length];
        Boolean[] flag2 = new Boolean[arr2.length];
        Arrays.fill(flag1, false);
        Arrays.fill(flag2, false);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    flag1[i] = true;
                    flag2[j] = true;
                }
            }
        }
        for (int i = 0; i < flag1.length; i++) {
            if (!flag1[i]) {
                return false;
            }
        }
        for (int j = 0; j < flag2.length; j++) {
            if (!flag2[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] arr2 = {2, 1};
        PrintArray(arr);
        PrintArray(arr2);
        System.out.print(ArraysEqual(arr, arr2));
    }
}
