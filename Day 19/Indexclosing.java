import java.util.Stack;

public class Main {
    static int IndexClosing(String arr, int index) {
        Stack<Character> stack = new Stack<>();
        char[] b = arr.toCharArray();
        
        for (int i = index; i < arr.length(); i++) {
            if (b[i] == '[' || b[i] == '{' || b[i] == '(') {
                stack.push(b[i]);
            } else if ((b[i] == ']' && !stack.isEmpty() && stack.peek() == '[') ||
                       (b[i] == '}' && !stack.isEmpty() && stack.peek() == '{') ||
                       (b[i] == ')' && !stack.isEmpty() && stack.peek() == '(')) {
                stack.pop();
            }
            
            if (arr.charAt(index) == '[' && stack.isEmpty()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr = "[ABC[23]][89]";
        System.out.print(IndexClosing(arr, 1));
    }
}
