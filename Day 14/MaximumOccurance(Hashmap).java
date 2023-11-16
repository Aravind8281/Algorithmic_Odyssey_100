import java.util.*;

public class Main {
    public static void countFrequency(String str,char a){
        str =str.toLowerCase();
        
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int count=0;
        for(char c:str.toCharArray()){
            if(freq.get(c)>count){
                count=freq.get(c);
            }
        }
        for(char c:str.toCharArray()){
            if(freq.get(c)==count){
                System.out.print(c);
            }
        }
    }
    public static void main(String[] args) {
        String str="aaraavind";
        countFrequency(str,'a');
    }
}
