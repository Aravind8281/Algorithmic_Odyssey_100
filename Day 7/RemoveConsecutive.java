import java.util.*;

class Main {
    static void RemoveConsecutive(String name){
        char[] word=name.toCharArray();
        System.out.print(word[0]);
        for(int i=0;i<word.length;i++){
            
            if(i!=0 && i<word.length-1){
                if(word[i]==word[i-1] || word[i]==word[i+1])
                    continue;
                else
                    System.out.print(word[i]);
            }
            
        }
        System.out.print(word[word.length-1]);
    }

    public static void main(String[] args) {
        String name = "geeksforgeeks";
        RemoveConsecutive(name);
    }
}
