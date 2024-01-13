import java.util.*;

public class Main {
    static Map<String, Integer> mem = new HashMap<>();

    static int solve(int[] nums, int x, int left, int right, int count) {
        if (x == 0) {
            return count;
        }
        if (x < 0 || left > right) {
            return -1; // Return -1 when a valid solution is not found
        }
        String key = left + "*" + right + "*" + x;
        if (mem.containsKey(key)) {
            return mem.get(key);
        }
        int l = solve(nums, x - nums[left], left + 1, right, count + 1);
        int r = solve(nums, x - nums[right], left, right - 1, count + 1);
        int result = Math.min(l, r);
        mem.put(key, result);
        return result;
    }

    static int minoperation(int[] nums, int x) {
        int ans = solve(nums, x, 0, nums.length - 1, 0);
        return ans == -1 ? -1 : ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int x = 11;
        int result = minoperation(nums, x);

        System.out.println("Minimum operations to get sum " + x + ": " + result);
    }
}
