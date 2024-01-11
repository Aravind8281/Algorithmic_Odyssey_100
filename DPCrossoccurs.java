import java.util.*;

class Main {
    static boolean Crossoccurs(int[][] arr, int i, int j, Boolean[][] memo) {
        if (i <0) {
            return true;
        }

        if (memo[i][j] != null) {
            return memo[i][j];
        }

        if (arr[i][j] == 0) {
            memo[i][j] = false;
        } else {
            memo[i][j] = Crossoccurs(arr, i - 1, j + 1, memo);
        }

        return memo[i][j];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 0, 0}
        };
        int i = arr.length - 1;
        int j = 0;
        Boolean[][] memo = new Boolean[arr.length][arr[0].length];
        System.out.print(Crossoccurs(arr, i, j, memo));
    }
}
