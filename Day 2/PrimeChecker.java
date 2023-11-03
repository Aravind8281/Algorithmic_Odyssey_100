import java.util.*;
class Main{
    static boolean prime(int element){
        for(int i=2;i<element;i++){
            if((element%i)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int element=4;
        System.out.print(prime(element));
    }
}
