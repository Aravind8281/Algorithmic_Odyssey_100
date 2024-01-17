import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int solve(int[][] A) {
        List<int[]> data = new ArrayList<>();
        for (int[] interval : A) {
            data.add(new int[]{interval[0], 1});
            data.add(new int[]{interval[1], -1});
        }
        Collections.sort(data, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        int current = 0;
        int maxOverlap = 0;
        for (int[] entry : data) {
            current += entry[1];
            maxOverlap = Math.max(maxOverlap, current);
        }
        return maxOverlap;
    }
    public static void main(String[] args) {
        int[][] arr = {{5, 10}, {15, 20}, {0, 30}};
        System.out.print(solve(arr)); // Output: 2
    }
}
