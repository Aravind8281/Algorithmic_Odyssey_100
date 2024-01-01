import java.util.*;
class Main {
    static Set<String> memo = new HashSet<>();
    static void permutation(String pr, String str) {
        if (str.isEmpty()) {
            if (!memo.contains(pr)) {
                System.out.println(pr);
                memo.add(pr);
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                String currentChar = String.valueOf(str.charAt(i));
                String remaining = str.substring(0, i) + str.substring(i + 1);
                String key = pr + currentChar + remaining;

                if (!memo.contains(key)) {
                    memo.add(key);
                    permutation(pr + currentChar, remaining);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "abab";
        permutation("", str);
        System.out.print(memo);
    }
}
