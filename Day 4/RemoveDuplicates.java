public class Main {
    static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void RemoveDuplicates(int[] arr) {
        int max = maximum(arr);
        int[] B = new int[max + 1]; // Corrected size of array B
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            B[k]++;
        }
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 4, 4, 5, 6, 7, 8};
        RemoveDuplicates(arr);
    }
}
