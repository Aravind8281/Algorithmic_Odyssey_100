import java.util.*;

public class Main {
    static int minJump(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int[] min=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            min[i]=Integer.MAX_VALUE;
        }
        min[0]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                min[j]=Math.min(min[j],1+min[i]);
            }
        }
        return min[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,1,2,1};
        System.out.print(minJump(arr));
    }
}
