import java.util.*;
class Main{
    static int Bitwise(int m,int n){
        int shifts=0;
        while(m<n){
            m>>=1;
            n>>=1;
            shifts++;
        }
        return m<<shifts;
    }
    public static void main(String[] args){
        int m=5;
        int n=7;
        System.out.println(Bitwise(m,n));
        
    }
}
