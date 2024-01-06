import java.util.*;
public class Main {
    static HashMap<String, List<String>> memo = new HashMap<>();
    static List<String> getAllStringways(String target, String[] arr) {
        if (target.equals("")) {
            List<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        List<String> allWays = new ArrayList<>();
        for (String str : arr) {
            if (target.startsWith(str)) {
                String suffix = target.substring(str.length());
                List<String> suffixWays = getAllStringways(suffix, arr);
                for (String way : suffixWays) {
                    allWays.add(str + way);
                }
            }
        }
        memo.put(target, allWays);
        return allWays;
    }
    public static void main(String[] args) {
        String target = "purple";
        String[] arr = { "pu", "rp", "ple", "le", "purp" };
        List<String> allWays = getAllStringways(target, arr);

        System.out.println("All possible ways to form '" + target + "':");
        for (String way : allWays) {
            System.out.println(Arrays.asList(way.split("(?<=\\G.{3}),")));
        }
    }
}
