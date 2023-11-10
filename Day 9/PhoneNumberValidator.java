import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		Pattern p=Pattern.compile("(0||91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(sentence);
		if(m.find()){
		    System.out.print("Correct Phone Number");
		}
		else{
		    System.out.print("Please Enter Correct Phone number");
		}
	}
}
