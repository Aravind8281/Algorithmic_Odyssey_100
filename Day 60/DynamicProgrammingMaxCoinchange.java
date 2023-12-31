import java.util.*;

public class Main {
    private static Map<Integer, Integer> memo = new HashMap<>();

    static int maxCoins(int amount, int[] arr) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        int maxcoins = -1;
        for (int i : arr) {
            int subamount = amount - i;
            int subcoins = maxCoins(subamount, arr);
            if (subcoins != -1) {
                int numcoins = subcoins + 1;
                if (numcoins > maxcoins || maxcoins == -1) {
                    maxcoins = numcoins;
                }
            }
        }

        memo.put(amount, maxcoins);
        return maxcoins;
    }

    public static void main(String[] args) {
        int amount = 4;
        int[] arr = {1, 2, 3};
        System.out.println(maxCoins(amount, arr));
    }
}
