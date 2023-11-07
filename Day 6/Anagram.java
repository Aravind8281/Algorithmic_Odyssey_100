import java.util.*;

class Main {
    static boolean AnagChecker(int[] B) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] != 0) {
                return false;
            }
        }
        return true;
    }

    static void Anagram(String word1, String word2) {
        char[] B = word1.toCharArray();
        char[] C = word2.toCharArray();

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : B) {
            charCount[c]++;
        }

        for (char c : C) {
            charCount[c]--;
        }

        System.out.print(AnagChecker(charCount));
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        Anagram(word1, word2);
    }
}
