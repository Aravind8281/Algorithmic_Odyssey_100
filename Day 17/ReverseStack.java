import java.util.*;

public class Main {
    static void Reverse(int[] arr) {
        Stack<Integer> newStack = new Stack<>();
        for(Integer i:arr){
            newStack.push(i);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=newStack.pop();
        }
        for(Integer i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] stack={1,2,3,4,5};
        Reverse(stack);
    }
}
