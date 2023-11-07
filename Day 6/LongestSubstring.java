import java.util.*;
class Main{
    static void LongestSubSequence(String word,int k){
        int start,end;
        start=end=0;
        int maxlength=0;
        Map<Character,Integer> map=new HashMap<>();
        while(end<word.length()){
            char Charfound=word.charAt(end);
            map.put(Charfound,map.getOrDefault(Charfound,0)+1);
            while(map.size()>k){
                char Charfrom=word.charAt(start);
                map.put(Charfrom,map.get(Charfrom)-1);
                if(map.get(Charfrom)==0){
                    map.remove(Charfrom);
                }
                start++;
            }
            maxlength=Math.max(end-start+1,maxlength);
            end++;
        }
        System.out.print(maxlength);
    }
    public static void main(String[] args){
        String word="bccbababd";
        LongestSubSequence(word,2);
    }
}
