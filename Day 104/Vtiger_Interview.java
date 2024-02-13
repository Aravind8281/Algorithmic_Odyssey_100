import java.util.*;
public class Main
{   
    static String[] formatWord(String[] str,int maxlength){
        String[] modified=new String[str.length];
        for(int i=0;i<str.length;i++){
            int remaining=Math.abs(maxlength-str[i].length());
            if(remaining<maxlength){
                if(remaining%2==0){
                modified[i]=" ".repeat(remaining/2)+str[i]+" ".repeat(remaining/2);
                }
                else{
                    int odd_space=remaining/2;
                    int even_space=odd_space+1;
                    modified[i]=" ".repeat(odd_space)+str[i]+" ".repeat(even_space);
                }
            }
            else{
                return str;
            }
        }
        return modified;
    }
	public static void main(String[] args) {
		String s="Java is a versatile programming language. It is widely used for developing various applications. Java provides platform independence, making it highly popular.This passage is used to demonstrate the formatWord method in action.";
		String[] str=s.split("\\.");
		String[] formatted=formatWord(str,80);
		for(int i=0;i<formatted.length;i++){
		    System.out.println(formatted[i]);
		}
	}
}
