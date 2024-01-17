import java.util.Arrays;
public class Main {
    static int assignMiceToHoles(int[] mice, int[] holes) {
        Arrays.sort(mice);
        Arrays.sort(holes);
        int maxTime = 0;
        for (int i = 0; i < mice.length; i++) {
            int time = Math.abs(mice[i] - holes[i]);
            maxTime = Math.max(maxTime, time);
        }

        return maxTime;
    }

    public static void main(String[] args) {
        int[] mice = {4, -2, 7};
        int[] holes = {2, 8, 1};
        System.out.println(assignMiceToHoles(mice, holes));
    }
}
