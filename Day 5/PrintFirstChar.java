import java.util.*;
class Main{
    public static void main(String[] args){
        String first="Hello AV Its Strings";
        char[] a=first.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]!=' '){
                if(i==0)
                    System.out.print(a[i]+" ");
                else if(a[i-1]== ' ')
                    System.out.print(a[i]+" ");
            }
        }
        
    }
}
