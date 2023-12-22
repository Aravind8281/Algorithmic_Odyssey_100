import java.util.*;

public class Main {
    static int Fibonacci(int sum) {
        if(sum==0 || sum==1){
            return sum;
        }
        return Fibonacci(sum-1)+Fibonacci(sum-2);
    }
    public static void main(String[] args) {
        int sum=5;
        System.out.print(Fibonacci(sum));
    }
}
