import java.util.*;
public class Main {
    public static String Formatter(String number){
        String digits=number.replaceAll("[^\\d]", "");
        if(digits.length()!=10){
            System.out.print("Mistake Invalid");
        }
        String formatted="("+digits.substring(0,3)+")"+digits.substring(3,6)+"-"+digits.substring(6);
        return formatted;
    }
    public static void main(String[] args) {
        String number="9894936228";
        System.out.print(Formatter(number));
    }
}
