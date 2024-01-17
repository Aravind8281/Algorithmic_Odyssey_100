public class Main {
    static int minMoves(String seats) {
        int n = seats.length();
        int[] leftDistances = new int[n];
        int[] rightDistances = new int[n];
        int leftMax = -1;
        int rightMax = -1;
        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == 'x') {
                leftMax = i;
            }
            leftDistances[i] = i - leftMax;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (seats.charAt(i) == 'x') {
                rightMax = i;
            }
            rightDistances[i] = rightMax - i;
        }
        int minMoves = 0;
        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == '.') {
                int minDistance = Math.min(leftDistances[i], rightDistances[i]);
                minMoves += minDistance;
            }
        }
        return minMoves;
    }
    public static void main(String[] args) {
        String seats = ".x..x..x.";
        System.out.println(minMoves(seats));
    }
}
