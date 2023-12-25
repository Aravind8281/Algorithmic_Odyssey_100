public class Main {
    public static void main(String[] args) {
        int num = 123;
        printSubstrings(num);
    }
    public static void printSubstrings(int num) {
        String numStr = Integer.toString(num);
        printSubstringsHelper(numStr, 0);
    }
    private static void printSubstringsHelper(String str, int index) {
        int length = str.length();
        if (index == length) {
            return;
        }
        for (int i = index; i < length; i++) {
            System.out.println(str.substring(index, i + 1));
        }
        printSubstringsHelper(str, index + 1);
    }
}
