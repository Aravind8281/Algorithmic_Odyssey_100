class Main{
    static int Digit(int num,int count){
        if(num==0){
            return count;
        }
        num=num/10;
        count++;
        return Digit(num,count);
    }
    public static void main (String[] args) {
        int num=1234;
        int count=0;;
        System.out.print(Digit(num,count));
    }
}
