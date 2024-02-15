import java.util.*;
class Hello{
    void Hey(){
        
    }
}
public class Main
{
	public static void main(String[] args) {
		Hello h=new Hello(){
		    void Hey(){
		        System.out.print("Message");
		    }
		};
		h.Hey();
	}
}
