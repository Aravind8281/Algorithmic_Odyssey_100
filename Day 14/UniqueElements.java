import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> name = new HashSet<>();
        int[] arr={1,2,3,4,5,1,2};
        for(int i=0;i<arr.length;i++){
            name.add(arr[i]);
        }

        System.out.print(name);
    }
}
