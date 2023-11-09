public class Main {
    public static String timeToString(int hours, int minutes) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};
        String timeString = "";
        if (hours >= 1 && hours <= 9) {
            timeString += ones[hours] + " ";
        } else if (hours >= 11 && hours <= 19) {
            timeString += teens[hours - 10] + " ";
        } else if (hours >= 20 && hours <= 23) {
            timeString += tens[hours / 10] + " ";
            if (hours % 10 != 0) {
                timeString += ones[hours % 10] + " ";
            }
        } else if (hours == 10) {
            timeString += "ten ";
        } else if (hours == 0 || hours == 24) {
            timeString += "twelve ";
        }
        if (minutes == 45) {
            timeString += "forty-five ";
        } else if (minutes >= 1 && minutes <= 9) {
            timeString += ones[minutes] + " ";
        } else if (minutes >= 11 && minutes <= 19) {
            timeString += teens[minutes - 10] + " ";
        } else if (minutes >= 20 && minutes <= 59) {
            timeString += tens[minutes / 10] + " ";
            if (minutes % 10 != 0) {
                timeString += ones[minutes % 10] + " ";
            }
        }
        timeString += "o'clock";

        return timeString;
    }

    public static void main(String[] args) {
        int hours = 7;
        int minutes = 45;
        String timeInWords = timeToString(hours, minutes);
        System.out.println(timeInWords);
    }
}
