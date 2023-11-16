import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Character> name = new HashMap<>();
        int count = 0;
        String Name = "Aravind";
        Name = Name.toLowerCase();
        char[] b = Name.toCharArray();

        for (int i = 0; i < b.length; i++) {
            if (b[i] != 'a' && b[i] != 'e' && b[i] != 'i' && b[i] != 'o' && b[i] != 'u') {
                name.put(count++, b[i]);
            }
        }

        System.out.print(name);
    }
}
