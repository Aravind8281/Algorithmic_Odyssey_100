import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		Pattern p=Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[0-2])-(1[0-9]{3}|[2-9][0-9]{3})$");
		Matcher m=p.matcher(sentence);
		if(m.find()){
		    System.out.print("Valid Date");
		}
		else{
		    System.out.print("Not Valid");
		}
	}
}
