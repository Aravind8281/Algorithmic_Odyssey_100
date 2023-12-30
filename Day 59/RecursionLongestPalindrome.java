import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "aaaabbaa";
        ArrayList<String> substrings = printSubstringsHelper(str, 0);
        int count = 0;
        for (int i = 0; i < substrings.size(); i++) {
            String currentSubstring = substrings.get(i);
            if (ispalindrome(currentSubstring) > 0 && ispalindrome(currentSubstring) > count) {
                count = ispalindrome(currentSubstring);
            }
        }
        System.out.print(count);
    }
    static int ispalindrome(String str) {
        char[] ch = str.toCharArray();
        int j = str.length() - 1;
        int i = 0;
        
        while (i <= j) {
            if (ch[i] != ch[j]) {
                return 0;
            }
            i++;
            j--;
        }

        return str.length();
    }
    static ArrayList<String> printSubstringsHelper(String str, int index) {
        ArrayList<String> array = new ArrayList<>();
        int length = str.length();
        if (index == length) {
            return array;
        }
        for (int i = index; i < length; i++) {
            array.add(str.substring(index, i + 1));
        }
        array.addAll(printSubstringsHelper(str, index + 1));
        return array;
    }
}
