class Main {
    static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void Missing_Positive(int[] arr) {
        int max = maximum(arr);
        int[] B_array = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int k = arr[i];
                B_array[k]++;
            }
        }
        for (int i = 1; i < B_array.length; i++) {
            if (B_array[i] == 0) {
                System.out.print(i);
                return; 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2, 11, 1, -3, 2, 10, 4};
        Missing_Positive(arr);
    }
}
