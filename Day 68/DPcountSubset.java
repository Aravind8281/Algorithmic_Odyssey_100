import java.util.*;
public class Main {
    static int countSubset(int[] arr, int sum) {
        if (arr.length == 0 || sum <= 0) {
            return 0;
        }
        int n = arr.length;
        int[][] count = new int[n][sum + 1];
        for (int i = 0; i < n; i++) {
            count[i][0] = 1;
        }
        for (int j = 1; j <= sum; j++) {
            count[0][j] = (arr[0] == j) ? 1 : 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= sum; j++) {
                int includeCurrentValue = (j >= arr[i]) ? count[i - 1][j - arr[i]] : 0;
                int excludeCurrentValue = count[i - 1][j];
                count[i][j] = includeCurrentValue + excludeCurrentValue;
            }
        }
        return count[n - 1][sum];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 8;
        System.out.println(countSubset(arr, sum));
    }
}
