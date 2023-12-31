import java.util.*;
public class Main{
    public static Map<Integer,Integer> map=new HashMap<>();
    static int fib(int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n==1||n==0){
            return n;
        }
        else{
            int result=fib(n-1)+fib(n-2);
            map.put(n,result);
            return result;
        }
    }
    public static void main (String[] args) {
        System.out.print(fib(4));
    }
}
