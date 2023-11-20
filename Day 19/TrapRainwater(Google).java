public class Main {
    static void RainWaterTrap(int[] arr) {
        int n = arr.length;
        int left = 1;
        int right = n - 2;
        int maxLeft = arr[0];
        int maxRight = arr[n - 1];
        int trappedWater = 0;

        while (left <= right) {
            if (maxLeft <= maxRight) {
                if (arr[left] >= maxLeft) {
                    maxLeft = arr[left];
                } else {
                    trappedWater += maxLeft - arr[left];
                }
                left++;
            } else {
                if (arr[right] > maxRight) {
                    maxRight = arr[right];
                } else {
                    trappedWater += maxRight - arr[right];
                }
                right--;
            }
        }
        System.out.print(trappedWater);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        RainWaterTrap(arr);
    }
}
