class Main {
    static int Minimum(int[] arr, int start) {
        int min = start;
        for (int i = start; i <arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
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
            int ind=i;
            int min = Minimum(arr, i);
            swap(arr, min, i);
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
