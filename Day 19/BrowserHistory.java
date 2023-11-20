import java.util.Stack;

public class Main {
    public static Stack<String> forward = new Stack<>();
    public static Stack<String> backward = new Stack<>();

    Main(String homepage) {
        backward.push(homepage);
    }

    static void visit(String url) {
        while (!forward.isEmpty()) {
            forward.pop();
        }
        backward.push(url);
    }

    static String back(int count) {
        int size = backward.size();
        count = Math.min(count, size - 1);

        while (count-- > 0) {
            forward.push(backward.pop());
        }

        return backward.peek();
    }

    static String forward(int count) {
        int size = forward.size();

        while (count-- > 0 && !forward.isEmpty()) {
            backward.push(forward.pop());
        }

        return backward.peek();
    }

    public static void main(String[] args) {
        String homepage = "gfg.org";
        String url = "google.com";
        visit(url);
        url = "facebook.com";
        visit(url);
        url = "youtube.com";
        visit(url);
        System.out.println(back(1));
        System.out.println(back(1));
        System.out.println(forward(1));
        visit("linkedin.com");
        System.out.println(forward(2));
        System.out.println(back(2));
        System.out.println(back(7));
    }
}
