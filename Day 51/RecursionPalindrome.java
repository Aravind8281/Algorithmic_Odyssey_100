import java.util.*;
public class Main
{   static Boolean Palindrome(String str){
        if(str.length()==0||str.length()==1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return Palindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
	public static void main(String[] args) {
		String str="Mal";
		System.out.print(Palindrome(str));
	}
}
