import java.util.*;
class Main{
    static void MaxinEven(int[] arr){
        int max=0;
        for(int i=1;i<arr.length;i=i+2){
            if(((i+1)%2)==0){
                if(max<arr[i])
                    max=arr[i];
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,7,8};
        MaxinEven(arr);
    }
}
