class Fruit{
    void reverse(int num){
        int reversed=0;
        while(num!=0){
            int k=num%10;
            reversed=reversed*10+k;
            num=num/10;
        }
        System.out.print(reversed);
    }
}
class Main{
    public static void main(String[] args){
        Fruit a=new Fruit();
        int num=411;
        a.reverse(num);
    }
}
