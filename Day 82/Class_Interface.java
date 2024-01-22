interface Shape {
    String getName();
}

interface Circle {
    String getCircleName();
}

class S implements Shape, Circle {
    private String name;
    private String circle;

    public S(String name, String circle) {
        this.name = name;
        this.circle = circle;
    }

    @Override
    public String getName() {
        return "Shape is " + name;
    }

    @Override
    public String getCircleName() {
        return "Shape is " + circle;
    }
}
public class Main {
    public static void main(String[] args) {
        S s = new S("Square", "Circle");
        System.out.println(s.getName());        
        System.out.println(s.getCircleName());  
    }
}
