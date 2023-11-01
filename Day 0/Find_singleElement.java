import java.util.*;
class Main{
    static int single(int[] arr){
        int single=0;
        for(int num:arr){
            single^=num;
        }
        return single;
    }
    public static void main(String[] args){
        int[] arr={2,2,5,6,5};
        System.out.println(single(arr));
        
    }
}
