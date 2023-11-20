import java.util.*;

public class Main {
    static void StockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] b = new int[arr.length]; // Fix here
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty() && i == 0) {
                b[i] = 1;
                stack.push(i); // Fix here
            } else if (arr[i] < arr[stack.peek()]) {
                b[i] = Math.abs(stack.peek() - i); // Fix here
                stack.push(i);
            }
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85}; // 1 1 1 2 1 4 6
        StockSpan(arr);
    }
}
