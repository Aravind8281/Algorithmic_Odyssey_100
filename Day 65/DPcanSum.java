import java.util.*;

public class Main {
    static HashMap<Integer, Boolean> memo = new HashMap<>();

    static boolean canSum(int target, int[] arr) {
        if (target == 0) {
            return true;
        }

        if (target < 0) {
            return false;
        }

        if (memo.containsKey(target)) {
            return memo.get(target);
        }

        for (int i : arr) {
            int remainder = target - i;
            if (canSum(remainder, arr)) {
                memo.put(target, true);
                return true;
            }
        }

        memo.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 7};
        System.out.println(canSum(7, arr));
    }
}
