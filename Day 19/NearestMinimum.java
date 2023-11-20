import java.util.Stack;

public class Main {
    static int[] NextMinimumleft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < stack.peek()) {
                b[i]=arr[i];
                stack.pop();
            }
            if(stack.isEmpty()){
                b[i]=-1;
                stack.push(arr[i]);
            }
            else if(arr[i]>stack.peek()){
                b[i]=stack.peek();
                stack.push(arr[i]);
            }
            
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};
        int[] result=NextMinimumleft(arr);
        //_, 1, 1,  4, 1, 2
        for (int i : result) {
            System.out.print(i + " ");
        }
        
        
    }
}
