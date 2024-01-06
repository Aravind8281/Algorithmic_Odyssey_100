import java.util.*;
public class Main { 
    static int fibTabulation(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 0);
        arr[1] = 1; 
        for (int i = 0; i < n; i++) {
            arr[i + 1] += arr[i];
            if (i + 2 <= n) {
                arr[i + 2] += arr[i];
            }
        }
        return arr[n];
    }
    public static void main(String[] args) {
        System.out.print(fibTabulation(6));
    }
}
