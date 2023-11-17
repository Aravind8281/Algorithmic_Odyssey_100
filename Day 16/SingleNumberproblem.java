//one of the popular and easy hashmap problem which deals with finding single occurance of number
import java.util.*;

public class Main {
    static void SingleNumber(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6,2, 1, 1};
        SingleNumber(arr);
    }
}
