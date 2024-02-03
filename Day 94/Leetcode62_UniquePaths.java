class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        return dfs(0,0,m,n);
    }
    public int dfs(int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]>0){
            return dp[i][j];
        }
        int right=dfs(i,j+1,m,n);
        int down=dfs(i+1,j,m,n);
        dp[i][j]=right+down;
        return dp[i][j];
    }
}
