import java.util.Arrays;

public class Main {

    static int waterPlants(int[] plants, int capacity) {
        int n = plants.length;
        int totalDistance = 0;

        for (int i = 0; i < n / 2; i++) {
            int leftPlant = plants[i];
            int rightPlant = plants[n - 1 - i];

            int waterNeeded = leftPlant + rightPlant - capacity;
            totalDistance += Math.abs(waterNeeded);
            plants[i] = Math.max(0, leftPlant - waterNeeded);
            plants[n - 1 - i] = Math.max(0, rightPlant - waterNeeded);
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        int[] plants = {2, 4, 5, 1, 2}; 
        int capacity = 5;               
        Arrays.sort(plants);
        System.out.println(waterPlants(plants, capacity));
    }
}
