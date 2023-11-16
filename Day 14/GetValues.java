import java.util.HashMap;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		HashMap<Integer,String> name=new HashMap<>();
		name.put(0,"Aravind");
		name.put(1,"Tony");
		name.put(2,"Damon");
		name.put(3,"Stefan");
		name.put(4,"Ariana");
		name.put(5,"Dua");
		name.put(6,"Taylor");
		name.put(7,"Gilbert");
		name.put(8,"Elena");
		for(int i=0;i<name.size()-1;i++){
		    System.out.println(name.get(i));
		}
	}
}
