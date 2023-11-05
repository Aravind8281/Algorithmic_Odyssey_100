import java.util.*;
class Main{
    static void AbsoluteDiff(int[] arr){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2)==0){
                even++;
            }
            else
                odd++;
        }
        System.out.print(Math.abs(even-odd));
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,7,8};
        AbsoluteDiff(arr);
    }
}
