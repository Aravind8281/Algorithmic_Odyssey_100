import java.util.*;

public class Main {
    static int coinChange2(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        System.out.print(coinChange2(arr, 5));
    }
}
