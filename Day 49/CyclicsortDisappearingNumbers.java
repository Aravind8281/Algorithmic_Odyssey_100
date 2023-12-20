import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static List<Integer> CyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4, 7 };
        List<Integer> missingElements = CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingElements);
    }
}
