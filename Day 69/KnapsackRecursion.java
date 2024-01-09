import java.util.*;
public class Main{
    static int knapsack(int[] weight,int[] profit,int maxweight,int n){
        //base condition
        if(n==0||maxweight==0){
            return 0;
        }
        //skip where maxweight is lesser then current weight
        if(weight[n]>maxweight){
            return knapsack(weight,profit,maxweight,n-1);
        }
        // return max value between exclude and include value
        else{
            return Math.max(
            profit[n]+knapsack(weight,profit,maxweight-weight[n],n-1),//include case subtract weight of current item w[n] - maxweight
            knapsack(weight,profit,maxweight,n-1)//exclude case 
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
