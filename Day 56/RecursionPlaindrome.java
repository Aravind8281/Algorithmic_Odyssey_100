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
    static boolean palindrome(String str){
        char[] arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        List<String> permutations = permutation("", "app");
        int count=0;
        for (String perm : permutations) {
            if(palindrome(perm)){
                count++;
            }
        }
        System.out.print(count);
    }
}
