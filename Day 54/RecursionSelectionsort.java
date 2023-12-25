public class Main {
    static void selectionSort(int[] arr, int start) {
        if (start < arr.length - 1) {
            int minIndex = findMinIndex(arr, start, start + 1);
            if (minIndex != start) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[start];
                arr[start] = temp;
            }
            selectionSort(arr, start + 1);
        }
    }

    static int findMinIndex(int[] arr, int minIndex, int currentIndex) {
        if (currentIndex == arr.length) {
            return minIndex;
        }
        if (arr[currentIndex] < arr[minIndex]) {
            minIndex = currentIndex;
        }
        return findMinIndex(arr, minIndex, currentIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
