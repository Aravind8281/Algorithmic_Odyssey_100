import java.util.*;

public class Main {
    private static Map<Integer, Integer> memo = new HashMap<>();

    static int minCoins(int amount, int[] arr) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        int mincoins = -1;
        for (int i : arr) {
            int subamount = amount - i;
            int subcoins = minCoins(subamount, arr);
            if (subcoins != -1) {
                int numcoins = subcoins + 1;
                if (numcoins < mincoins || mincoins == -1) {
                    mincoins = numcoins;
                }
            }
        }

        memo.put(amount, mincoins);
        return mincoins;
    }

    public static void main(String[] args) {
        int amount = 4;
        int[] arr = {1, 2, 3};
        System.out.println(minCoins(amount, arr));
    }
}
// return min number of element equalize amount
