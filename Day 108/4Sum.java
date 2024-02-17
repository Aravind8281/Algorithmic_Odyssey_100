import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }

        Arrays.sort(nums); // Sort the array for efficient two-pointer search

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { // Skip duplicates
                continue;
            }

            int first = nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) { // Skip duplicates
                    continue;
                }

                int second = nums[j];
                int remaining = target - first - second;

                // Two-pointer search for remaining pair
                int low = j + 1;
                int high = nums.length - 1;
                while (low < high) {
                    int third = nums[low];
                    int fourth = nums[high];
                    int sum = second + third + fourth;

                    if (sum == remaining) {
                        result.add(Arrays.asList(first, second, third, fourth));
                        low++;
                        high--;
                    } else if (sum < remaining) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return result;
    }
}
