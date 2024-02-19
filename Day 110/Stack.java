import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"{", "[", "(", "}", ")", "]", "{", "}"};
        int c = 0, p = 0, r = 0;
        
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String currentBracket = arr[i];
            
            if (currentBracket.equals("{") || currentBracket.equals("[") || currentBracket.equals("(")) {
                stack.push(currentBracket);
            } else if (!stack.isEmpty()) {
                String openBracket = stack.pop();
                
                if ((openBracket.equals("{") && currentBracket.equals("}")) ||
                    (openBracket.equals("[") && currentBracket.equals("]")) ||
                    (openBracket.equals("(") && currentBracket.equals(")"))) {
                    if (openBracket.equals("{")) c++;
                    else if (openBracket.equals("[")) p++;
                    else if (openBracket.equals("(")) r++;
                } else {
                    System.out.println("Unbalanced brackets!");
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Unbalanced brackets!");
        } else {
            System.out.println(c + " " + p + " " + r);
        }
    }
}
