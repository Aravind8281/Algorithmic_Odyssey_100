import java.util.ArrayList;
import java.util.List;
public class Main {
    static List<int[]> findGasStations(int[] distances, int[] fuels, int carCapacity) {
        List<int[]> stops = new ArrayList<>();
        int currentFuel = 0;
        int currentDistance = 0;
        for (int i = 0; i < distances.length; i++) {
            currentFuel += fuels[i];
            if (currentFuel < distances[i] - currentDistance) {
                stops.add(new int[]{currentDistance, currentFuel});
                currentFuel = 0;
            }

            currentDistance = distances[i];
        }
        stops.add(new int[]{currentDistance, currentFuel});

        return stops;
    }

    public static void main(String[] args) {
        int[] distances = {100, 200, 300, 400};  
        int[] fuels = {50, 20, 30, 10};           
        int carCapacity = 100;                   

        List<int[]> gasStations = findGasStations(distances, fuels, carCapacity);
        for (int[] stop : gasStations) {
            System.out.println("Distance: " + stop[0] + ", Fuel: " + stop[1]);
        }
    }
}
