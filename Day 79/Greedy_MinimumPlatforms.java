import java.util.Arrays;
class Main {
    public static int findMinPlatforms(int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);
        int platformsNeeded = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        while (i < arrivals.length && j < departures.length) {
            if (arrivals[i] <= departures[j]) {
                platformsNeeded++;
                i++;
            } else {
                platformsNeeded--;
                j++;
            }
            result = Math.max(result, platformsNeeded);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
        int[] departures = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findMinPlatforms(arrivals, departures));
    }
}
