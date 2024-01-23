class Example {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
class Main{
    public static void main (String[] args) {
        Example e=new Example();
        System.out.println(e.add(2,3));
        System.out.println(e.add(2.2,2.3));
    }
}
