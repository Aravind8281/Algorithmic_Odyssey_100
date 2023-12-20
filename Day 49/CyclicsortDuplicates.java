import java.util.Arrays;

public class Main {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int Duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length) {
                if (arr[i] != i + 1) {
                    int correct = arr[i] - 1;
                    if (arr[i] != arr[correct]) {
                        swap(arr, i, correct);
                    } else {
                        return arr[i];
                    }
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4, 7 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Duplicate(arr));
    }
}
