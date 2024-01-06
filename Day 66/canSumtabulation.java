import java.util.*;
public class Main {
    static boolean canSumTabulation(int target, int[] arr) {
        boolean[] tab = new boolean[target + 1];
        Arrays.fill(tab, false);
        tab[0] = true;
        for (int i = 0; i <= target; i++) {
            if (tab[i]) {
                for (int num : arr) {
                    if (i + num <= target) {
                        tab[i + num] = true;
                    }
                }
            }
        }
        return tab[target];
    }
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 7 };
        System.out.print(canSumTabulation(7, arr));
    }
}
