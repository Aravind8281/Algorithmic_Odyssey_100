import java.util.*;

public class Main {
    public static void Currency(int amount) {
        final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        final String[] tens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        final String[] tens1 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        final String[] Hundred = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        if (amount == 0) {
            System.out.print("Zero");
            return;
        }

        String currencyWords = "";
        if (amount >= 100) {
            currencyWords += Hundred[amount / 100] + " ";
            amount %= 100;
        }

        if (amount >= 11 && amount <= 19) {
            currencyWords += tens[amount - 10] + " ";
        } else if (amount >= 20) {
            currencyWords += tens1[amount / 10] + " ";
            amount %= 10;
        }

        if (amount > 0) {
            currencyWords += ones[amount] + " ";
        }

        System.out.println(currencyWords.trim());
    }

    public static void main(String[] args) {
        int amount = 323;
        Currency(amount);
    }
}
