import java.util.*;
class Main{
    static void reverse(String first){
        char[] a=first.toCharArray();
        int i=0;int j=a.length-1;
        while(i<j){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.print(a);
    }
    public static void main(String[] args){
        String first="Hello olleH";
        reverse(first);
        
    }
}
