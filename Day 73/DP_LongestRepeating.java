import java.util.*;
public class Main
{
    static int LongestReapeating(char[] s1,char[] s2){
        int n=s1.length;
        int m=s2.length;
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(s1[i-1]==s2[j-1] && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(
                    dp[i-1][j],
                    dp[i][j-1]
                    );
                }
            }
        }
        return dp[n][m];
    }
	public static void main(String[] args) {
		char[] s1={'A','B','A','X'};
		char[] s2={'A','A','B','X'};
		System.out.print(LongestReapeating(s1,s2));
	}
}
