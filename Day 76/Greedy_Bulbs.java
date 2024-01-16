import java.util.*;

public class Main {
    static int Bulbs(int[] arr) {
        int cost = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cost % 2 == 0) {
                arr[i] = 1 - arr[i];
                cost++; 
            } 
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] bulbsState = {0, 1, 0, 1, 1, 0};
        int result = Bulbs(bulbsState);
        System.out.println(result);
    }
}
