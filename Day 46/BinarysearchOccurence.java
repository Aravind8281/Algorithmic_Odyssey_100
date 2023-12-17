import java.util.*;
class Main{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] occurance(int[] arr,int target){
        int[] ans={-1,-1};
        int low=Search(arr,target,true);
        int high=Search(arr,target,false);
        ans[0]=low;
        ans[1]=high;
        return ans;
    }
    static int Search(int[] arr,int target,Boolean find){
        int ans=-1;
       int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) { 
            mid = low + (high - low) / 2; 
            if (arr[mid] == target) {
                ans=mid;
                if(find){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        int[] arr={5,7,7,7,8,8,10};
        PrintArray(arr);
        int[] res=occurance(arr,7);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
