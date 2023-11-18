import java.util.Stack;

public class Main {
    static String reverseString(String name) {
        Stack<Character> stack = new Stack<>();
        for (Character c : name.toCharArray()) {
            stack.push(c);
        }
        char[] arr=new char[name.length()];
        for(int i=0;i<name.length();i++){
            arr[i]=stack.pop();
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String name = "{}}";
        System.out.println(reverseString(name));
    }
}
