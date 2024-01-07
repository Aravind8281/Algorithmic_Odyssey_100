import java.util.*;
public class Main {
    static Map<String, Boolean> memo = new HashMap<>();
    static boolean subsetsum(int[] arr, int n, int pos, int sum) {
        String key = pos + "," + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (sum == 0) {
            return true;
        }
        if (pos < 0 || sum < 0) {
            return false;
        }
        boolean result = subsetsum(arr, n, pos - 1, sum - arr[pos]) || subsetsum(arr, n, pos - 1, sum);
        memo.put(key, result);
        return result;
    }
    static boolean canPartition(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        memo.clear();
        return subsetsum(arr, n, n - 1, sum / 2);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 11};
        System.out.print(canPartition(arr));
    }
}
