import java.util.*;

public class Main {
    static boolean FindDuplicate(int[] arr,int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getKey()==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6,2, 1, 1};
        System.out.print(FindDuplicate(arr,1));
    }
}
