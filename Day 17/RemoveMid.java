import java.util.*;

public class Main {
    static void FindMid(Stack<Integer> stack) {
        int[] arr = new int[stack.size() - 1];
        int mid = stack.size() / 2;
        for (int i = 0; i < mid; i++) {
            arr[i] = stack.pop();
        }
        stack.pop();
        for (int i = mid; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        FindMid(stack);
    }
}
