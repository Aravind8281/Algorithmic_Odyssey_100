import java.util.*;
public class Main{
    static int knapsack(int[] weight,int[] profit,int maxweight,int n){
        if(n==0||maxweight==0){
            return 0;
        }
        if(weight[n]>maxweight){
            return knapsack(weight,profit,maxweight,n-1);
        }
        else{
            return Math.max(
            profit[n]+knapsack(weight,profit,maxweight-weight[n],n-1),
            knapsack(weight,profit,maxweight,n-1)
            );
        }
    }
    public static void main (String[] args) {
        int[] weight={2,3,4};
        int[] profit={2,5,8};
        int maxweight=8;
        int n=weight.length-1;
        System.out.print("Max Profit :"+knapsack(weight,profit,maxweight,n));
    }
}
