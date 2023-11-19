import java.util.*;

public class Main{
    public static String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.equals(".") && !component.isEmpty()) {
                stack.push(component);
            }
        }

        StringBuilder result = new StringBuilder("/");
        for (String dir : stack) {
            result.append(dir).append("/");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(simplifyPath("/home//foo/"));  
        System.out.println(simplifyPath("/a/./b/../../c/"));  
    }
}
