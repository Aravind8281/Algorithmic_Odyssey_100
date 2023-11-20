import java.util.Stack;

public class Main {
    static boolean RemovedString(String arr) {
        Stack<Character> stack = new Stack<>();
        for (char i : arr.toCharArray()) {
            if (i == '#' && stack.isEmpty()) {
                stack.push(i);
            } else if (!stack.isEmpty() && stack.peek() == '#' && i == '#') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "geee#e#ks";
        String t = "gee##eeks";
        if (RemovedString(s) && RemovedString(t)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
