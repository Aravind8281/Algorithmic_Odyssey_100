import java.util.*;

public class Main {
    static int HighestProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int hi3=arr[n-1]*arr[n-2]*arr[n-3];
        int low3=arr[0]*arr[1]*arr[n-1];
        return Math.max(hi3,low3);
    }
    public static void main(String[] args) {
        int[] arr = { -10, -10, 1, 3, 2 };
        System.out.print(HighestProduct(arr));
    }
}
