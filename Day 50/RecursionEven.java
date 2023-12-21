// Printing Even Element in given Range using Recursion
class Main{
    static void Even(int n,int count){
        if(n==count){
            return;
        }
        count++;
        if(count%2==0){
            System.out.print(count +"  ");
        }
        Even(n,count);
    }
    public static void main (String[] args) {
        int n=100;
        int count=0;
        Even(n,count);
    }
}
