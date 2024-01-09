class Main{
    static int knapsack(int[] weight,int[] profit,int maxweight){
        int n=weight.length;
        int[][] memo=new int[n+1][maxweight+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=maxweight;j++){
                if(i==0||j==0){
                    memo[i][j]=0;
                }
                else if(weight[i-1]>j){
                    memo[i][j]=memo[i-1][j];
                }
                else{
                    memo[i][j]=Math.max(memo[i-1][j],profit[i-1]+memo[i-1][j-weight[i-1]]);
                }
            }
        }
        return memo[n][maxweight];
    }
    public static void main (String[] args) {
        int[] weight={2,3,4};
        int[] profit={2,5,8};
        int maxweight=8;
        System.out.print("Knapsack Problem : "+knapsack(weight,profit,maxweight));
    }
}
