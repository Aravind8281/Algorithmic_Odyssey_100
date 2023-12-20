import java.util.*;

public class Main {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void CyclicSort(int[] arr) {
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
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                System.out.println(j);
                break;
            }
        }
        
        
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 0, 4 };
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
