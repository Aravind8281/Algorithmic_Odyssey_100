import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class Main
{
    static boolean StrongPasswordChecker(String str){
        if(str.length()<8){
            return false;
        }
        Pattern lowercase=Pattern.compile("[a-z]");
		Matcher lm=lowercase.matcher(str);
		if(!lm.find()){
		    return false;
		}
		Pattern Uppercase=Pattern.compile("[A-Z]");
		Matcher um=Uppercase.matcher(str);
		if(!um.find()){
		    return false;
		}
		Pattern number=Pattern.compile("[0-9]");
		Matcher nm=number.matcher(str);
		if(!nm.find()){
		    return false;
		}
		Pattern special=Pattern.compile("[^a-zA-Z0-9]");
		Matcher sm=special.matcher(str);
		if(!sm.find()){
		    return false;
		}
        return true;
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		if(StrongPasswordChecker(sentence)){
		    System.out.print("Strong Password");
		}
		else{
		    System.out.print("Weak Password");
		}
	}
}
