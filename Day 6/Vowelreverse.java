import java.util.*;

class Main {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    static void Reverse(String word) {
        char[] B = word.toCharArray();
        int k = 0;
        int l = B.length - 1;

        while (k < l) {
            while (k < l && !isVowel(B[k])) {
                k++;
            }
            while (k < l && !isVowel(B[l])) {
                l--;
            }
            if (k < l) {
                char temp = B[k];
                B[k] = B[l];
                B[l] = temp;
                k++;
                l--;
            }
        }
        System.out.print(B);
    }

    public static void main(String[] args) {
        String word = "vowel";
        Reverse(word);
    }
}
