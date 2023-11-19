import java.util.Stack;

public class Main {
    static void NextMaximum(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] b = new int[n];
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                b[index] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            b[stack.pop()] = -1;
        }

        for (int i : b) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 23, 2, 25, 27};
        NextMaximum(arr);
    }
}
