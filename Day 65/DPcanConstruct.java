import java.util.*;
public class Main {
    static HashMap<String, Boolean> memo = new HashMap<>();
    static boolean canConstruct(String str, String[] arr) {
        if (str.equals("")) {
            return true;
        }
        if (memo.containsKey(str)) {
            return memo.get(str);
        }
        for (String prefix : arr) {
            if (str.startsWith(prefix)) {
                String suffix = str.substring(prefix.length());
                if (canConstruct(suffix, arr)) {
                    memo.put(suffix, true);
                    return true;
                }
            }
        }
        memo.put(str, false);
        return false;
    }
    public static void main(String[] args) {
        String[] arr = {"abc", "ab", "abcd", "def"};
        System.out.println(canConstruct("abcdef", arr));
    }
}
