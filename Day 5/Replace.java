import java.util.*;
class Main{
    public static void main(String[] args){
        String first="Hello AV Its Strings";
        Scanner sc=new Scanner(System.in);
        char string=sc.next().charAt(0);
        char rep=sc.next().charAt(0);
        char[] a=first.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]==string){
                a[i]=rep;
            }
        }
        System.out.print(a);
    }
}
