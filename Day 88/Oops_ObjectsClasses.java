public class Main implements Cloneable {

    private int myValue;

    public MyClass(int myValue) {
        this.myValue = myValue;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(myValue);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass obj1 = new MyClass(42);

        int hashValue = obj1.hashCode();
        System.out.println("HashCode: " + hashValue);

        MyClass obj2 = (MyClass) obj1.clone();
        System.out.println("Clone: " + obj2.myValue);
    }
}
