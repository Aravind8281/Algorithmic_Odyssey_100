class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        return dfs(0, 0, grid);
    }
    public int dfs(int i, int j, int[][] grid) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
        if (j < grid[0].length - 1) {
            right = dfs(i, j + 1, grid);
        }
        if (i < grid.length - 1) {
            down = dfs(i + 1, j, grid);
        }
        dp[i][j] = grid[i][j] + Math.min(right, down);
        return dp[i][j];
    }
}
