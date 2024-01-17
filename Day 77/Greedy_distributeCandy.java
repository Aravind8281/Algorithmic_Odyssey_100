public class Main {
    static void distributeCandies(int[] candies) {
        int n = candies.length;
        int[] result = new int[n];
        for (int i = 1; i < n; i++) {
            if (candies[i] > candies[i - 1]) {
                result[i] = result[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (candies[i] > candies[i + 1]) {
                result[i] = Math.max(result[i], result[i + 1] + 1);
            }
        }
        System.out.print("Candies distribution: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] candies = {1, 0, 2};
        distributeCandies(candies);
    }
}
