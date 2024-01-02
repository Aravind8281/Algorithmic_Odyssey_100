import java.util.*;

public class Main {
    static int LCS(String s1,int n) {
        int[][] arr=new int[n][n];
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    arr[i][j]=2+arr[i+1][j-1];
                }
                else{
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j-1]);
                }
            }
        }
        return arr[0][n-1];
    }
    public static void main(String[] args) {
        String s1="abeebac";
        int n=s1.length();
        System.out.print(LCS(s1,n));
    }
}
