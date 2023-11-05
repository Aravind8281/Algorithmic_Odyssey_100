import java.util.*;

public class Main {
    static int maximum(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        return max;
    }

    static void MaxSub(int[] arr) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        int count;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count = arr[i] + arr[j];
                B.add(count);
            }
        }
        System.out.println(maximum(B));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        MaxSub(arr);
    }
}
