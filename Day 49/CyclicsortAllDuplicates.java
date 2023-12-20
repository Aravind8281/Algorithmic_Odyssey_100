import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                duplicates.add(arr[j]);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Duplicates: " + findDuplicates(arr));
    }
}
