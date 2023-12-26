public class Main{
    static String SkipCharacter(char[] str,String res,int count){
        int n=str.length;
        if(count==n){
            return res;
        }
        if(str[count]!='a'){
            res=res+str[count];
        }
        return SkipCharacter(str,res,count+1);
    }
    public static void main (String[] args) {
        char[] str={'b','a','b','b','c','d'};
        String res="";
        System.out.print(SkipCharacter(str,res,0));
    }
}
