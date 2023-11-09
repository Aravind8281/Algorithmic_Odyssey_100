import java.util.*;
public class Main
{
    public static void wordlist(String[] arr){
        
        String[] str={"one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<str.length;j++){
                if(arr[i]==str[j]){
                    System.out.print(j+1);
                }
            }
        }
    }
	public static void main(String[] args) {
		String[] arr={"nine","eight","seven","six"};
		wordlist(arr);
	}
}
