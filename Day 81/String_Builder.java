import java.util.*;

class Main {
    public static void main(String[] args) {
        String a = "av";
        String b = "av";
        System.out.println(a == b); // true, as both refer to the same string literal

        String c = new String("Hey");
        String d = new String("Hey");
        System.out.println(c == d); // false, as new objects are created using the 'new' keyword

        StringBuilder sb1 = new StringBuilder(); // Empty StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello"); // StringBuilder with initial value

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appending a string
        sb.append(123); // Appending an integer
        sb.insert(5, " Java"); // Inserting at a specific index
        System.out.println(sb.toString()); // Output: Hello Java World123

        sb = new StringBuilder("Hello World");
        sb.delete(5, 10); // Deleting characters from index 5 to 9
        sb.deleteCharAt(2); // Deleting character at index 2
        sb.setLength(0); // Clearing the StringBuilder

        System.out.println(sb.toString()); // Output: ""
    }
}
