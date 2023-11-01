import java.util.*;
class Main{
    static int setbit(int num){
        int count=0;//count number of bits 
        while(num>0){
            num=num&(num-1); //flip bits 
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(setbit(num));
    }
}
/*25&24
1st iteration
110010
110000
return 24
2nd iteration 
24&23
110000
101111
return 16
3rd iteration 16&15
010000
001111
return 0

count 3
*/
