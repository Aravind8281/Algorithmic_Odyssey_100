public class Main{
    static int Reverse(int num,int reversed){
        if(num==0){
            return reversed;
        }
        int reminder=num%10;
        reversed=reversed*10+reminder;
        return Reverse(num/10,reversed);
    }
    public static void main (String[] args) {
        int num=9894;
        int rev=Reverse(num,0);
        System.out.print(rev);
    }
}
