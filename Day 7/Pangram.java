import java.util.*;
public class Main
{
    static boolean pangramChecker(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                return false;
            }
        }
        return true;
    }
    static void pangram(String pan){
        char[] B=pan.toCharArray();
        int[] array=new int[26];
        for(int i=0;i<B.length;i++){
            int k=Math.abs(97-(int)B[i]);
            
            array[k]++;
        }
        System.out.println(pangramChecker(array));
        
    }
	public static void main(String[] args) {
		String pan="sphinxofblackquartzjudgemyvow";
		pangram(pan);
	}
}
