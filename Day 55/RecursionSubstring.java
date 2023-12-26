public class Main{
    static void Subseq(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        
        char ch=str.charAt(0);
        Subseq(p,str.substring(1));
        Subseq(p+ch,str.substring(1));
        
    }
    public static void main (String[] args) {
        Subseq("","aaba");
    }
}
