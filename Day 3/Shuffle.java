import java.util.*;
class Main{
    static void shuffle(int[] arr){
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            int rand=random.nextInt(arr.length);
            int temp=arr[rand];
            arr[rand]=arr[i];
            arr[i]=temp;
        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        shuffle(arr);
    }
}
