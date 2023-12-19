class Main {
    static int[] BubbleSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] sort = BubbleSort(arr);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
