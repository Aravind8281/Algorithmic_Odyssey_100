class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        return dfs(0,0,obstacleGrid);
    }
    public int dfs(int i,int j,int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==1){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        if(dp[i][j]>0){
            return dp[i][j];
        }
        int right=dfs(i,j+1,grid);
        int down=dfs(i+1,j,grid);
        
        dp[i][j]=right+down;
        return dp[i][j];
    }
}
