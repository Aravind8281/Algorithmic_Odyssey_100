import java.util.*;
public class Main
{
    static void display(Stack<Integer> stack){
        for(Integer st:stack){
            System.out.println(st);
        }
    }
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		display(stack);
	}
}
