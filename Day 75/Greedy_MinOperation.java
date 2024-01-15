import java.util.*;

class Main {
    static int MinOperation(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                ans++;
                n--;
            }
            if (n == 0) {
                break;
            }
            n /= 2;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(MinOperation(8));
    }
}
