import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		Pattern p=Pattern.compile("^((25[0-5]||2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]||2[0-4][0-9]|[0-1]?[0-9][0-9]?)$");
		Matcher m=p.matcher(sentence);
		if(m.find()){
		    System.out.print("Valid Ip address");
		}
		else{
		    System.out.print("Invalid Ip address");
		}
	}
}
