import java.util.*;
public class Main
{   static String Binary(int decimal,String result){
        if(decimal==0){
            return result;
        }
        result=decimal%2+result;
        return Binary(decimal/2,result);
    }
	public static void main(String[] args) {
		int decimal=233;
		System.out.print(Binary(decimal,""));
	}
}
