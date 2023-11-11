import java.util.*;
class Main{
    static void Defront(String str){
        char[] chr=str.toCharArray();
        if(chr[0]=='a')
            System.out.print("a");
        System.out.print(str.substring(2,chr.length));
        
    }
    public static void main(String[] args){
        String str="aadit";
        Defront(str);
    }
}
