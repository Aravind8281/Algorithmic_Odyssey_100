import java.util.*;
class A {
    public A(){
        System.out.println("A class");
    }
}
class B extends A{
    public B(){
        System.out.println("B Class ");
    }
}
public class Main extends A
{
	public static void main(String[] args) {
		A a=new A(); // single class 
		B b=new B();//inherits both A and B class characters
	}
}
