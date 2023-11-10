import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		Pattern p=Pattern.compile("^(https?|ftp)://[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}(:\\d+)?(/[A-Za-z0-9.-]*)*(\\?[A-Za-z]+=[A-Za-z0-9.-]+)?" +"(#[A-Za-z]+)?$");
		Matcher m=p.matcher(sentence);
		if(m.find()){
		    System.out.print("Valid Url");
		}
		else{
		    System.out.print("Not Valid Url");
		}
	}
}
