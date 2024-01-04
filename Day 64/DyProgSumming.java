import java.util.*;

class Main {
    static int summingSquares(int n) {
        return summingSquares(n, new HashMap<>());
    }

    static int summingSquares(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) {
            return 0;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            int square = i * i;
            int numSquares = 1 + summingSquares(n - square, memo);
            min = Math.min(min, numSquares);
        }
        memo.put(n, min);
        return min;
    }

    public static void main(String[] args) {
        int n = 12;

        int result = summingSquares(n);
        System.out.println(result);
    }
}
