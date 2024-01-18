import java.util.Arrays;
import java.util.Comparator;
 
public class FractionalKnapsack {
    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        double[][] items = new double[n][3];
        for (int i = 0; i < n; i++) {
            items[i][0] = weights[i];
            items[i][1] = values[i];
            items[i][2] = (double) values[i] / weights[i]; 
        } 
        Arrays.sort(items, Comparator.comparingDouble(item -> item[2]).reversed());

        double maxValue = 0;
        int remainingCapacity = capacity;
        for (double[] item : items) {
            if (remainingCapacity <= 0) {
                break;
            }
            double fraction = Math.min(1.0, remainingCapacity / item[0]);
            maxValue += fraction * item[1];
            remainingCapacity -= fraction * item[0];
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
