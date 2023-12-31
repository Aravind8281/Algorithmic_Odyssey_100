import java.util.*;
public class Main{
    public static Map<Integer,Integer> map=new HashMap<>();
    static int fib(int n){
        int result;
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n==0||n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        result=fib(n-1)+fib(n-2)+fib(n-3);
        map.put(n,result);
        return result;
    }
    public static void main (String[] args) {
        System.out.print(fib(4));
    }
}
