// 63 = the no of bits activated is 6
import java.util.*;
public class Main{
    static void setbits(int n,int count){
        if(n==0){
            System.out.print(count);
            return;
        }
        if(n%2!=0){
            count++;
        }
        setbits(n/2,count);
    }
    public static void main (String[] args) {
        setbits(63,0);    
    }
}
