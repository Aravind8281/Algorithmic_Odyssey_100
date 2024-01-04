import java.util.*;

class Main {
    static int summingSquares(int n, List<Integer> coins) {
        return summingSquares(n, 0, coins, new HashMap<>());
    }

    static int summingSquares(int n, int coinIndex, List<Integer> coins, HashMap<List<Integer>, Integer> memo) {
        if (n == 0) {
            return 1;
        }
        if (coinIndex >= coins.size()) {
            return 0;
        }
        List<Integer> key = List.of(n, coinIndex);

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int totalWays = 0;
        int coinValue = coins.get(coinIndex);

        for (int qty = 0; qty * coinValue <= n; qty++) {
            int subAmount = n - (qty * coinValue);
            totalWays += summingSquares(subAmount, coinIndex + 1, coins, memo);
        }

        memo.put(key, totalWays);
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 12;
        List<Integer> coins = Arrays.asList(1, 2, 3);

        int result = summingSquares(n, coins);
        System.out.println(result);
    }
}
