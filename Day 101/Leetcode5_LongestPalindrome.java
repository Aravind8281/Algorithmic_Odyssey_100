class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Initialize the dp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int longest = 0;
        int start = 0;
        int count = 0;

        // Iterate over all possible lengths of substrings
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                // If substring has length 1, it is a palindrome of length 1
                if (i == 1) {
                    dp[j][j] = 1;
                }
                
                else if (i == 2 && s.charAt(j) == s.charAt(j + 1)) {
                    dp[j][j + 1] = 2;
                    longest = 2;
                    start = j;
                    count = 2;
                }
                else if (s.charAt(j) == s.charAt(j + i - 1) && dp[j + 1][j + i - 2] != -1) {
                    dp[j][j + i - 1] = dp[j + 1][j + i - 2] + 2;
                    if (dp[j][j + i - 1] > longest) {
                        longest = dp[j][j + i - 1];
                        start = j;
                        count = i;
                    }
                }
            }
        }

        return s.substring(start, start + count);
    }
}
