import java.util.*;

class Main {
    static int NthStair(int[] arr, int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (arr[n] == 0) {
            arr[n] = 1+Math.min(Math.min(NthStair(arr, n - 1), NthStair(arr, n - 2)), NthStair(arr, n - 3));
        }

        return arr[n];
    }

    public static void main(String[] args) {
        int target = 5;
        int[] dp = new int[target + 1]; 

        System.out.print(NthStair(dp, target));
    }
}
