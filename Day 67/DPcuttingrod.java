import java.util.Arrays;

public class Main {
    static int rod_cutting(int[] price, int[] length, int rod_len, int n) {
        int[][] dp = new int[n + 1][rod_len + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= rod_len; j++) {
                if (j == 0 || i == 0) {
                    dp[i][j] = 0;
                } else if (j < length[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                }
            }
        }
        return dp[n][rod_len];
    }

    public static void main(String[] args) {
        int[] price = {1, 2, 5};
        int[] length = {1, 2, 3};
        int rod_len = 5;
        int n = price.length;

        System.out.println(rod_cutting(price, length, rod_len, n));
    }
}
