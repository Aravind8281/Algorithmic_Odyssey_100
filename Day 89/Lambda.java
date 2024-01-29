import java.util.*;
class Main{
    public static void main (String[] args) {
        Runnable myRunnable=()->System.out.print("Message");
        myRunnable.run(); 
    }
}
