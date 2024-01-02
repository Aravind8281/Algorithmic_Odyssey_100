import java.util.*;
public class Main{
    static int LCS(String s1,String s2,int n,int m){
        if(n==0||m==0){
            return 0;
        }
        int lcs=0;
        int[][] arr=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];
                    lcs=Math.max(lcs,arr[i][j]);
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return lcs;
    }
    public static void main (String[] args) {
        String s1="abde";
        String s2="acd";
        int n=s1.length();
        int m=s2.length();
        System.out.print("Longest Common Subsequence :"+LCS(s1,s2,n,m));
    }
}
