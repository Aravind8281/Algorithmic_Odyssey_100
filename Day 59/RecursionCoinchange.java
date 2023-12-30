public class Main{
    static int CoinChange(int coins[], int n, int sum){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(n<=0){
            return 0;
        }
        return CoinChange(coins,n-1,sum)+CoinChange(coins,n,sum-coins[n-1]);
    }
    public static void main (String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        System.out.print(CoinChange(arr,n,5));
    }
}
