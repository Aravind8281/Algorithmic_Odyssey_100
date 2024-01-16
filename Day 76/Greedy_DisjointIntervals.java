import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Main {
    static List<int[]> findDisjointIntervals(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        if (intervals == null || intervals.length == 0) {
            return result;
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));
        int[] current = intervals[0];
        result.add(current);
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (current[1] < next[0]) {
                current = next;
                result.add(current);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 4},
                {5, 7},
                {6, 8}
        };

        List<int[]> disjointIntervals = findDisjointIntervals(intervals);
        for (int[] interval : disjointIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
