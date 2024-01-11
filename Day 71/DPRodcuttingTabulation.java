import java.util.*;
class Main {
    static int rodcutting(int[] length, int[] price, int rod) {
        int n = length.length;
        int[][] dp = new int[n + 1][rod + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= rod; j++) {
                if (length[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];//skip case
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], price[i - 1] + dp[i][j - length[i - 1]]);
                }
            }
        }
        return dp[n][rod];
    }
    public static void main(String[] args) {
        int[] length = {1, 2, 3, 4};
        int[] price = {1, 5, 8, 9};
        int rod = 4;
        System.out.println("Maximum Profit: " + rodcutting(length, price, rod));
    }
}
