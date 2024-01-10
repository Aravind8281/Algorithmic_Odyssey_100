import java.util.*;

public class Main {
    static boolean Knaprecursion(int[] amount, int target, int n) {
        if (n == 0) {
            return false;
        }
        if (target == 0) {
            return true;
        } else if (amount[n] >= target) {
            return Knaprecursion(amount, target, n - 1);
        } else {
            return Knaprecursion(amount, target - amount[n], n - 1) || Knaprecursion(amount, target, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] amount = {3, 2, 1, 3};
        int target = 7;
        int n = amount.length - 1;
        System.out.print(Knaprecursion(amount, target, n));
    }
}
