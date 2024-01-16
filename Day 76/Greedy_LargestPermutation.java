import java.util.*;
public class Main {
    static int[] largestPermutation(int[] arr, int k) {
        int n = arr.length;
        int[] index = new int[n + 1];
        for (int i = 0; i < n; i++) {
            index[arr[i]] = i;
        }
        for (int i = 0; i < n && k > 0; i++) {
            if (arr[i] == n - i) {
                continue; 
            }
            int temp = arr[i];
            arr[i] = n - i;
            arr[index[n - i]] = temp;
            index[temp] = index[n - i];
            index[n - i] = i;
            k--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};
        int k = 2;
        int[] result = largestPermutation(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
