class Main{
    static int Factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
    public static void main (String[] args) {
        int fact=5;
        System.out.print(Factorial(fact));
    }
}
