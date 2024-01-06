import java.util.*;

public class Main {
    static HashMap<String, Integer> memo = new HashMap<>();
    static int countStringways(String target, String[] arr) {
        if (target.equals("")) {
            return 1;
        }
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        int count = 0;
        for (String str : arr) {
            if (target.startsWith(str)) {
                String suffix = target.substring(str.length());
                count += countStringways(suffix, arr);
            }
        }
        memo.put(target, count);
        return count;
    }

    public static void main(String[] args) {
        String target = "purple";
        String[] arr = { "pu", "rp", "ple", "le" };
        System.out.print(countStringways(target, arr));
    }
}
