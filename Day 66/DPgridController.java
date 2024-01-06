import java.util.*;
public class Main {
    static long gridTraveller(int m, int n) {
        long[][] arr = new long[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(arr[i], 0);
        }
        arr[1][1] = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i + 1 <= n) {
                    arr[i + 1][j] += arr[i][j];
                }
                if (j + 1 <= m) {
                    arr[i][j + 1] += arr[i][j];
                }
            }
        }
        return arr[n][m];
    }
    public static void main(String[] args) {
        System.out.print(gridTraveller(3, 3));
    }
}
