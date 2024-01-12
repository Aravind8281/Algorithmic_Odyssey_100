import java.util.*;

public class Main {
    static int[][] dp; // Declare dp as a global variable for memoization

    static int LCSTabluation(char[] s1, char[] s2) {
        int n = s1.length;
        int m = s2.length;
        dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1[i - 1] == s2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    static String SCSTabluation(char[] s1, char[] s2) {
        int n = s1.length;
        int m = s2.length;
        StringBuilder ans = new StringBuilder();
        int p1 = 0, p2 = 0;

        while (p1 < n || p2 < m) {
            if (p1 < n && p2 < m && s1[p1] == s2[p2]) {
                ans.append(s1[p1]);
                p1++;
                p2++;
            } else if (p1 < n && (p2 == m || dp[p1 + 1][p2] >= dp[p1][p2 + 1])) {
                ans.append(s1[p1]);
                p1++;
            } else {
                ans.append(s2[p2]);
                p2++;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        char[] s1 = {'a', 'b', 'c', 'd', 'e'};
        char[] s2 = {'g', 'h', 'i', 'd', 'e'};
        LCSTabluation(s1, s2);
        System.out.print(SCSTabluation(s1, s2));
    }
}
