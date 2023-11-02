import java.util.*;

public class Main {
    static int maximum(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void MergeArray(int[] a1, int[] a2) {
        int max1 = maximum(a1);
        int max2 = maximum(a2);
        int max = Math.max(max1, max2);
        int[] b = new int[max + 1];

        for (int i = 0; i < a1.length; i++) {
            int k = a1[i];
            b[k]++;
        }

        for (int i = 0; i < a2.length; i++) {
            int k = a2[i];
            b[k]++;
        }

        for (int i = 0; i < max + 1; i++) {
            if(b[i]!=0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4 };
        int[] a2 = { 5, 6, 7 };
        MergeArray(a1, a2);
    }
}
