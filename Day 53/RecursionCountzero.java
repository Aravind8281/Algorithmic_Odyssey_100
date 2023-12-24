public class Main{
    static int CountZero(int num,int count){
        if(num==0){
            return count;
        }
        if(num%10==0){
            count++;
        }
        return CountZero(num/10,count);
    }
    public static void main (String[] args) {
        int num=9080904;
        int rev=CountZero(num,0);
        System.out.print(rev);
    }
}
