import java.util.*;

public class Main {
    public static void countFrequency(String str,char a){
        str =str.toLowerCase();
        
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(char c:str.toCharArray()){
            if(freq.get(c)==1){
                System.out.print(c);
            }
        } 
    }
    public static void main(String[] args) {
        String str="aaraavind";
        countFrequency(str,'a');
    }
}
