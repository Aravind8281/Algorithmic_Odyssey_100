import java.util.*;
public class Main {
    static HashMap<Integer, ArrayList<Integer>> memo = new HashMap<>();

    static ArrayList<Integer> bestSum(int target, int[] arr) {
        if (target == 0) {
            return new ArrayList<>();
        }
        if (target < 0) {
            return null;
        }
        if (memo.containsKey(target)) {
            return new ArrayList<>(memo.get(target));
        }
        ArrayList<Integer> bestCombination = null;
        for (int i : arr) {
            int remainder = target - i;
            ArrayList<Integer> remainderCombination = bestSum(remainder, arr);
            if (remainderCombination != null) {
                remainderCombination.add(i);
                if (bestCombination == null || remainderCombination.size() < bestCombination.size()) {
                    bestCombination = new ArrayList<>(remainderCombination);
                }
            }
        }
        memo.put(target, bestCombination);
        return bestCombination;
    }
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 2, 7};
        System.out.println(bestSum(7, arr1));
    }
}
