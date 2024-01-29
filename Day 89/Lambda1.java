import java.util.*;
class Main{
    public static void main (String[] args) {
        Calculator add=(a,b)->a+b;
        Calculator sub=(a,b)->a-b;
        System.out.print(calculate(add,5,3));
        System.out.print(calculate(sub,5,3));
    }
    interface Calculator{
        int calculate(int a,int b);
    }
    static int calculate(Calculator calculator,int a,int b){
        return calculator.calculate(a,b);
    }
}
