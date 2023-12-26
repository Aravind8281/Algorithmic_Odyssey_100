public class Main {
    static void permutation(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutation(f + str.charAt(0) + s, str.substring(1));
        }
    }

    public static void main(String[] args) {
        permutation("", "abc");
    }
}
