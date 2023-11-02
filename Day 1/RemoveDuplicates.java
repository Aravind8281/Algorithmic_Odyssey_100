class Main {
    static int maximum(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void reverse(int[] arr) {
        int max = maximum(arr);
        int[] b = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            b[k]++;
        }
        for (int k = 0; k < b.length; k++) {
            if (b[k] == 1) {
                System.out.print(k + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 4, 3, 3, 2, 1 };
        reverse(arr);
    }
}
