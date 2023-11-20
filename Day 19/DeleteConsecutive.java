import java.util.Stack;

public class Main {
    static int DeleteConsecutive(String[] arr) {
        Stack<String> stack = new Stack<>();
        for(String comp:arr){
            if(!stack.isEmpty() && stack.peek().equals(comp)){
                stack.pop();
            }
            else
                stack.push(comp);
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String[] arr = {"tom","jerry","jerry","tom"};
        System.out.print(DeleteConsecutive(arr));
    }
}
