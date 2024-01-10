public class Main{
    static boolean canPartition(int[] nums){
        int n=nums.length-1;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        Boolean[][] memo=new Boolean[n+1][sum/2+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum/2;j++){
                if(i==0||j==0){
                    memo[i][j]=false;
                }
                else if(nums[i-1]>j){
                    memo[i][j]=memo[i-1][j];
                }
                else if(nums[i-1]==j){
                    memo[i][j]=true;
                }
                else{
                    memo[i][j]=memo[i-1][j]||memo[i-1][j-nums[i-1]];
                }
            }
        }
        return memo[n][sum/2];
    }
    public static void main (String[] args) {
        int[] nums={1,5,5,11};
        System.out.print(canPartition(nums));
    }
}
