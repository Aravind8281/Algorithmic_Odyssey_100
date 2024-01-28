import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int Sequentialsum=Arrays.stream(numbers).map(x->x*x).sum();
        System.out.println(Sequentialsum);
        int parallelsum=Arrays.stream(numbers).parallel().map(x->x*x).sum();
        System.out.println(parallelsum);
    }
}
