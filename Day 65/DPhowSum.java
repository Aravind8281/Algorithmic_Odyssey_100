import java.util.*;
public class Main {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    static int howSum(int target, int[] arr) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0; 
        }
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        int totalCount = 0;
        for (int i : arr) {
            int remainder = target - i;
            totalCount += howSum(remainder, arr);
        }
        memo.put(target, totalCount);
        return totalCount;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 7};
        System.out.println(howSum(7, arr));
    }
}
