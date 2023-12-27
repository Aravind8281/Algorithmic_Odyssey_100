import java.util.ArrayList;
import java.util.List;

public class Main {
    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println("Combinations: " + p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0, i);
            System.out.println("String S: " + s);
            String f = p.substring(i);
            System.out.println("String F: " + f);
            permutation(s + up.charAt(0) + f, up.substring(1));
        }
    }

    public static void main(String[] args) {
        permutation("", "abc");
    }
}
