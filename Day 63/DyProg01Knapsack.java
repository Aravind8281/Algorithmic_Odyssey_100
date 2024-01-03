import java.util.*;
public class Main {
    static int[][] memo;
    static int Knapsack(int[] weight, int[] profit, int capacity, int i) {
        if (capacity == 0 || i == weight.length) {
            return 0;
        }
        if (memo[i][capacity] != -1) {
            return memo[i][capacity];
        }
        if (weight[i] > capacity) {
            memo[i][capacity] = Knapsack(weight, profit, capacity, i + 1);
            return memo[i][capacity];
        }
        int includeCurrent = profit[i] + Knapsack(weight, profit, capacity - weight[i], i + 1);
        int excludeCurrent = Knapsack(weight, profit, capacity, i + 1);
        memo[i][capacity] = Math.max(includeCurrent, excludeCurrent);
        return memo[i][capacity];
    }
    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 4};
        int[] profit = {1, 4, 7, 10};
        int capacity = 8;
        memo = new int[weight.length][capacity + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        System.out.println("Knapsack Problem: " + Knapsack(weight, profit, capacity, 0));
    }
}
