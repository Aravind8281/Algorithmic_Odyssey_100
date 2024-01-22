public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void displayMessage() {
        System.out.println("Singleton class method called.");
    }
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.displayMessage();
    }
}
