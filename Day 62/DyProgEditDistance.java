import java.util.*;

public class Main {
    static int LCS(String s1, String s2, int n, int m) {
        if (s1.equals(s2)) {
            return 0;
        }
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + LCS(s1, s2, n - 1, m - 1);
        }
        return 1 + Math.min(Math.min(LCS(s1, s2, n, m - 1), LCS(s1, s2, n - 1, m)), LCS(s1, s2, n - 1, m - 1));
    }

    public static void main(String[] args) {
        String s1 = "abde";
        String s2 = "acd";
        int n = s1.length();
        int m = s2.length();
        System.out.print("Edit Strings : " + LCS(s1, s2, n, m));
    }
}
