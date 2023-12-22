import java.util.*;
public class Main
{   static String Reverse(String str){
        if(str.equals("")){
            return "";
        }
        return Reverse(str.substring(1)) + str.charAt(0);
    }
	public static void main(String[] args) {
		String str="Hello";
		System.out.print(Reverse(str));
	}
}
