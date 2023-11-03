import java.util.*;
class Main{
    static void primegenerator(int nums){
        System.out.print("1 2 ");
        for(int i=3;i<nums;i++){
            boolean isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        int nums=24;
        primegenerator(nums);
    }
}
