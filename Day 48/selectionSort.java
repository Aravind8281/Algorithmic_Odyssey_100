class Main {
    static int Maximum(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int[] SelectionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int last = (arr.length - i) - 1; // to provide n-1 comparisons and find last index 
            int max = Maximum(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] sort = SelectionSort(arr);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
