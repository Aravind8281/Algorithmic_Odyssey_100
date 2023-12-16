import java.util.*;
class Main{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void Zeros(int[] arr){
        int n=arr.length-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
        PrintArray(arr);
        
    }
    public static void main (String[] args) {
        int[] arr={0,1,2,3,4,0,0};
        PrintArray(arr);
        Zeros(arr);
    }
}
