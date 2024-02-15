import java.util.*;
interface Hello{
    void hello();
}
class Main{
    public static void main (String[] args) {
        Hello h1=()->System.out.print("Message "); 
        h1.hello();
    }
}
