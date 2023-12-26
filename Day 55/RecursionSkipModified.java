public class Main{
    static void skip(String p,String str){
        if(str.isEmpty()){
            System.out.print(p);
            return;
        }
        char chh=str.charAt(0);
        if(chh=='a'){
            skip(p,str.substring(1));
        }
        else{
            skip(p+chh,str.substring(1));
        }
    }
    public static void main (String[] args) {
        skip("","baccbb");
    }
}
