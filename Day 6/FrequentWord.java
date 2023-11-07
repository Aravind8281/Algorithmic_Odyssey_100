import java.util.*;

class Main {
    static int maximum(int[] c){
        int max=c[0];
        for(int nums=0;nums<c.length;nums++){
            if(max<c[nums]){
                max=nums;
            }
        }
        return max;
    }
    static void Unique(String word1) {
        char[] B = word1.toCharArray();
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : B) {
            charCount[c]++;
        }
        System.out.print((char)maximum(charCount));
    }

    public static void main(String[] args) {
        String word1 = "listeen";
        Unique(word1);
    }
}
