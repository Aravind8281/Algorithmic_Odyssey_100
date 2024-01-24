import java.util.*;
class Employee{
    int id,marks,salary;
    String name,role;
    public Employee(int id,String name,int marks,int salary,String role){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.salary=salary;
        this.role=role;
    }
    void printthings(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.marks);
        System.out.println(this.salary);
        System.out.println(this.role);
    }
    void roleSetter(int salary){
        this.salary=salary;
    }
}
public class Main 
{
	public static void main(String[] args) {
		Employee s1=new Employee(1,"AV",300,30000,"Developer");
		s1.printthings();
		s1.roleSetter(40000);
		s1.printthings();
	}
}
