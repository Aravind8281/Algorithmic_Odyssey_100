import java.util.*;

class Main {
    static int nonAdjacent(List<Integer> nums) {
        return nonAdjacent(nums, 0, new HashMap<>());
    }

    static int nonAdjacent(List<Integer> nums, int i, HashMap<Integer, Integer> memo) {
        if (i >= nums.size()) {
            return 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        int result = Math.max(nums.get(i) + nonAdjacent(nums, i + 2, memo), nonAdjacent(nums, i + 1, memo));
        memo.put(i, result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 7, 9, 3, 1);

        int result = nonAdjacent(nums);
        System.out.println(result);
    }
}
