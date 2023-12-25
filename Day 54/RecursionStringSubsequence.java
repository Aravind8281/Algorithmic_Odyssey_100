public class Main {
    public static void main(String[] args) {
        String str="abcd";
        PrintSubstring(str,0);
    }
    static void PrintSubstring(String str,int index){
        int n=str.length();
        if(index==n){
            return;
        }
        for(int i=index;i<n;i++){
            System.out.println(str.substring(index,i+1));
        }
        PrintSubstring(str,index+1);
    }
}
