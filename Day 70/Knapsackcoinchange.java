public class Main {
    static int coinchange(int[] coins, int target, int n) {
        int[][] memo = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            memo[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (coins[i - 1] > j) {
                    memo[i][j] = memo[i - 1][j];
                } else {
                    memo[i][j] = memo[i - 1][j] + memo[i][j - coins[i - 1]];
                }
            }
        }
        return memo[n][target];
    }
    public static void main(String[] args) {
        int[] coins = {1,2,1};
        int target = 3;
        int n = coins.length;
        System.out.print(coinchange(coins, target, n));
    }
}
