public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Hello, Object!");
        System.out.println("Using toString method: " + myObject);
        MyClass anotherObject = new MyClass("Hello, Object!");
        System.out.println("Using equals method: " + myObject.equals(anotherObject));
        System.out.println("Using hashCode method: " + myObject.hashCode());
    }
}
class MyClass {
    private String message;
    public MyClass(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "MyClass{" +
                "message='" + message + '\'' +
                '}';
    }
}
