import java.util.*;

class Main {
    public static List<Integer> list = new ArrayList<>();

    static int LongestCommon(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            list.add(1);
        }
        int MaxLength = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && 1 + list.get(j) > list.get(i)) {
                    list.set(i, list.get(j) + 1);
                    MaxLength = Math.max(MaxLength, list.get(i));
                }
            }
        }
        return MaxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.print(LongestCommon(arr));
    }
}
