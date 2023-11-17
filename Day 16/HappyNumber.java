import java.util.*;

public class Main {
    static int calculateSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    static boolean HappyNumber(int element) {
        HashSet<Integer> num=new HashSet<>();
        while(element !=1 && !num.contains(element)){
            num.add(element);
            element=calculateSumOfSquares(element);
        }
        return element==1;
    }

    public static void main(String[] args) {
        int number=19;
        System.out.print(HappyNumber(number));;
    }
}
