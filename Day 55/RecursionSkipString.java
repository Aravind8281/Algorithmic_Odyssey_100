public class Main {
    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skip(str.substring(5)); // Skip the entire "apple" substring
        } else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.print(skip("bapplebbacd"));
    }
}
