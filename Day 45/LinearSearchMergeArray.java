// Merge Array using count method

import java.util.*;
class Main{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void Merge(int[] arr,int[] arr2){
        int count=0;
        int[] Merge=new int[(arr.length)+(arr2.length)];
        for(int i=0;i<arr.length;i++){Merge[count++]=arr[i];}
        for(int i=0;i<arr2.length;i++){Merge[count++]=arr2[i];}
        PrintArray(Merge);
    }
    public static void main (String[] args) {
        int[] arr={1,2};
        int[] arr2={4,5,6,7,9};
        PrintArray(arr);
        PrintArray(arr2);
        Merge(arr,arr2);
    }
}
