import java.util.*;

class Main {
    static void Capitalize(String name) {
        char[] word = name.toCharArray();
        for (int i = 1; i < word.length; i++) {
            if (word[i - 1] != ' ' && i < word.length) {
                word[i] = Character.toUpperCase(word[i]);
            }
        }
        System.out.println(String.valueOf(word));
    }

    public static void main(String[] args) {
        String name = "im coder";
        Capitalize(name);
    }
}
