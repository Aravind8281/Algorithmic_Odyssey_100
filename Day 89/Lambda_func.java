import java.util.*;
class Main{
    public static void main (String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Av");
        name.add("Tony");
        name.add("Elon");
        name.forEach(names->System.out.println("Hello "+names));
    }
}
