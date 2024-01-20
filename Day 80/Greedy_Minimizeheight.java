import java.util.Arrays;
public class Main{
    static int maxHeight(int[] blocks, int k) {
        int n = blocks.length;
        int max = 0;
        Arrays.sort(blocks);
        for (int i = n - 1; i >= 0; i--) {
            int height = blocks[i] + k * i;
            max = Math.max(max, height);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] blocks = {1, 2, 3}; 
        int k = 2;              
        System.out.println(maxHeight(blocks, k));
    }
}
