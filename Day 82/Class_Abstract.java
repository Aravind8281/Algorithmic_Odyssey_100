abstract class Shape{
    abstract double calculate();
    public void display(){
        System.out.println("this is shape");
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculate(){
        return Math.PI*radius*radius;
    }
}
class Main{
    public static void main (String[] args) {
        Circle c=new Circle(2);
        c.display();
        System.out.print(c.calculate());
    }
}
