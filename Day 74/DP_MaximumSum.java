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

    static int maxCircularSum(int[] arr) {
        int maxSubarraySum = kadane(arr);
        if (maxSubarraySum < 0) {
            return maxSubarraySum;
        }
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircularSubarraySum = totalSum + kadane(arr);
        return Math.max(maxSubarraySum, maxCircularSubarraySum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxCircularSubarraySum = maxCircularSum(arr);
        System.out.println(maxCircularSubarraySum);
    }
}
