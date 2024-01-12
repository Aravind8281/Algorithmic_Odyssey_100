import java.util.*;

public class Main {
    static int SubsetSumDifference(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        int diff = 100;
        for (int i = 0; i <= sum / 2; ++i) {
            int first = i;
            int second = sum - i;
            if (dp[n][i] == true && diff > Math.abs(first - second)) {
                diff = Math.abs(first - second);
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 11, 5};
        System.out.print(SubsetSumDifference(arr));
    }
}
