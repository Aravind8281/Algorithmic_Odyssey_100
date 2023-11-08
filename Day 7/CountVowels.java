import java.util.*;
class Main{
    public static void main(String[] args){
        int count=0;
        String name="aravindanvowel";
        char[] nameArray=name.toCharArray();
        for(int i=0;i<nameArray.length;i++){
            if(nameArray[i]=='a'||nameArray[i]=='e'||nameArray[i]=='i'||nameArray[i]=='o'||nameArray[i]=='u')
                count++;
        }
        System.out.print(count);
    }
}
