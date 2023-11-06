import java.util.*;
class Main{
    public static void main(String[] args){
        StringBuffer obj=new StringBuffer("helloworld");
        obj.replace(0,1,"a");
        obj.setCharAt(0,'j');
        System.out.print(obj);
    }
}
