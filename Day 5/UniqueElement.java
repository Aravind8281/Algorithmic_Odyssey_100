import java.util.*;

class Main {
    static void Unique(String first) {
        boolean[] visited = new boolean[256]; // Assuming ASCII characters
        
        char[] arr = first.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int index = (int) arr[i];
            if (!visited[index]) {
                System.out.print(arr[i]);
                visited[index] = true;
            }
        }
    }

    public static void main(String[] args) {
        String first = "heello";
        Unique(first);
    }
}
