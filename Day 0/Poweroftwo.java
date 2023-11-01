import java.util.*;
class Main{
    static boolean ispoweroftwo(int num){
        return num>0 && (num&(num-1))==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(ispoweroftwo(num))
            System.out.println("Power of two");
        else
            System.out.println("Not power of two");
    }
}
