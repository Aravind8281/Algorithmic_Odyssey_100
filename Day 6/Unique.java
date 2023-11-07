import java.util.*;

class Main {
    static void Unique(String word1) {
        char[] B = word1.toCharArray();
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : B) {
            charCount[c]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] == 1) {
                System.out.print((char)i);
            }
        }
    }

    public static void main(String[] args) {
        String word1 = "listeen";
        Unique(word1);
    }
}
