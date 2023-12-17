// follow same approach as ceil method just return element if found 
// else return next greater
import java.util.*;

class Main {
    static void PrintArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static char Floor(char[] arr, char target) {
        int low = 0;
        int high = arr.length - 1;
        char result = ' ';
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                result = arr[mid];
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        PrintArray(arr);
        System.out.println(Floor(arr, 'd'));
    }
}
