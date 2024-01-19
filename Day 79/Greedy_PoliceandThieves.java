public class Main {

    public static int catchThieves(char[] arr, int k) {
        int n = arr.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                for (int j = Math.max(0, i - k); j <= Math.min(n - 1, i + k); j++) {
                    if (arr[j] == 'T') {
                        arr[j] = 'C';
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] arr = {'P', 'T', 'T', 'P', 'T'};
        int k = 1;
        System.out.println(catchThieves(arr, k));
    }
}
