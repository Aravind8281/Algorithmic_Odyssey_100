import java.util.*;

public class Main {
    static boolean wordBreak(List<String> wordList, String word) {
        if (word.isEmpty()) {
            return true;
        }

        int wordLen = word.length();

        for (int i = 1; i <= wordLen; ++i) {
            String prefix = word.substring(0, i);

            if (wordList.contains(prefix) && wordBreak(wordList, word.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList(
            "mobile", "samsung", "sam", "sung", "man",
            "mango", "icecream", "and", "go", "i", "like",
            "ice", "cream");

        boolean result = wordBreak(wordList, "ilikesamsung");

        System.out.println(result);
    }
}
