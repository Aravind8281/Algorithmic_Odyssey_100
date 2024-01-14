import java.util.*;

public class Main {
    static int kadane(int[] arr) {
        int me = arr[0];
        int msf = arr[0];

        for (int i = 1; i < arr.length; i++) {
            me = Math.max(arr[i], me + arr[i]); 
            msf = Math.max(msf, me);
        }

        return msf;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSubarraySum = kadane(arr);
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum);
    }
}
