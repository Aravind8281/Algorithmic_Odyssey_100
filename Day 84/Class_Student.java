import java.util.*;
class Student{
    int id,marks;
    String name;
    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void printthings(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}
public class Main 
{
	public static void main(String[] args) {
		Student s1=new Student(1,"AV",300);
		s1.printthings();
	}
}
