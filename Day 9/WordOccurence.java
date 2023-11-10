import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main
{
	public static void main(String[] args) {
		String sentence="I'm a coder,coder learn Regex,Regex helps in Manipulation,coder is awesome";
		Pattern p=Pattern.compile("coder");
		Matcher m=p.matcher(sentence);
		int count=0;
		while(m.find()){
		    count++;
		}
		System.out.print(count);
	}
}
