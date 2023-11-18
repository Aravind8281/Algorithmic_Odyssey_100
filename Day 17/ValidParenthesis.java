import java.util.Stack;

public class Main {
    static boolean isValidParenthesis(String name) {
        Stack<Character> stack = new Stack<>();
        for (Character c : name.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '{' && c == '}') {
                        stack.pop();
                    } else if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                    } else if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String name = "{}}";
        System.out.println(isValidParenthesis(name));
    }
}
