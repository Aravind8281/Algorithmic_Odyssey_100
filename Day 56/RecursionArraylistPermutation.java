import java.util.ArrayList;
import java.util.List;
public class Main {
    static List<String> permutation(String p, String str) {
        List<String> result = new ArrayList<>();
        if (str.isEmpty()) {
            result.add(p);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String f = p + str.charAt(i);
                String s = str.substring(0, i) + str.substring(i + 1);
                result.addAll(permutation(f, s));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> permutations = permutation("", "app");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
