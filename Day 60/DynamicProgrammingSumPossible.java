import java.util.*;
public class Main{
    public static Map<Integer,Boolean> memo=new HashMap<>();
    static boolean sumPossible(int amount,List<Integer> num){
        if(amount==0){
            return true;
        }
        if(amount<0){
            return false;
        }
        if(memo.containsKey(amount)){
            return memo.get(amount);
        }
        for(int i:num){
            int subamount=amount-i;
            if(sumPossible(subamount,num)){
                memo.put(amount,true);
                return true;
            }
        }
        memo.put(amount,false);
        return false;
    }
    public static void main (String[] args) {
        int amount=4;
        List<Integer> num=Arrays.asList(1,2,3);
        System.out.println(sumPossible(amount,num));
    }
}
