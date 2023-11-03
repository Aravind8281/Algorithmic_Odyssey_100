class Fruit{
    int digits(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
}
class Main{
    public static void main(String[] args){
        Fruit a=new Fruit();
        int dig=353;
        System.out.print(a.digits(dig));
    }
}
