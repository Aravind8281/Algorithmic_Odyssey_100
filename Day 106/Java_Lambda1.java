import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> c = (x, y) -> x + y;
        int d = c.apply(10,10);
        System.out.print(d); 
    }
}
