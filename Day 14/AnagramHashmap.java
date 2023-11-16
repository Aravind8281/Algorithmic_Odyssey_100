import java.util.*;

public class Main {
    public static Boolean AreAnagrams(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        HashMap<Character,Integer> Frequency=new HashMap<>();
        for(char c:str1.toCharArray()){
            Frequency.put(c,Frequency.getOrDefault(c,0)+1);
        }
        for(char c:str2.toCharArray()){
             if (!Frequency.containsKey(c)) {
                return false;
            }

            Frequency.put(c, Frequency.get(c) - 1);

            if (Frequency.get(c) == 0) {
                Frequency.remove(c);
            }
        }
        return Frequency.isEmpty();
    }
    public static void main(String[] args) {
        String str1="are";
        String str2="rea";
        System.out.print(AreAnagrams(str1,str2));
    }
}

