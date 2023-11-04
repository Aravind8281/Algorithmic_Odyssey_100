import java.util.*;
class Dutch{
    void intersection(int[] arr,int[] arr2,List<Integer> final1){
        int i=0;
        int j=0;
        while(i<arr.length && j<arr2.length){
            while((i<arr.length-1)&&(arr[i]==arr[i+1])){
                i++;
            }
            while((j<arr2.length-1)&& (arr[j]==arr[j+1])){
                j++;
            }
            if(arr[i]<arr2[j]){
                i++;
            }
            else if(arr[i]>arr2[j]){
                j++;
            }
            else{
                final1.add(arr[i]);
                i++;
                j++;
            }
        }
        for(int nums:final1){
            System.out.print(nums);
        }
       
    }
       
}
public class Main
{
public static void main(String[] args) {
        Dutch execute=new Dutch();
        int[] arr={2,1,2,3,5,6,7};
        int[] arr2={1,2,3,4,5,6,8};
        List<Integer> final1=new ArrayList<Integer>();
        execute.intersection(arr,arr2,final1);

}
}

