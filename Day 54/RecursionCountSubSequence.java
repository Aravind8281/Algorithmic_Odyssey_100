public class Main {
    public static void main(String[] args) {
        String str="123";
        System.out.print("Count of Substring : "+CountSubstring(str,0,1));
    }
    static int CountSubstring(String str,int index,int count){
        int n=str.length();
        if(index==n){
            return count;
        }
        for(int i=index;i<n;i++){
            str.substring(index,i+1);
            count++;
        }
        return CountSubstring(str,index+1,count);
    }
}
