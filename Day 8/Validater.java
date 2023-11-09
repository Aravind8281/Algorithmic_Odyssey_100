import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String phoneNumber1 = "(123) 456-7890";
        if (isValidPhoneNumber(phoneNumber1)) {
            System.out.println(phoneNumber1 + " is a valid phone number.");
        } else {
            System.out.println(phoneNumber1 + " is not a valid phone number.");
        }
    }
}
