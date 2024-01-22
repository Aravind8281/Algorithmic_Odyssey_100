import java.util.*;
enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

class Main {
    public static void main(String[] args) {
        Days today = Days.WEDNESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a regular weekday.");
        }

        System.out.println("Is today a weekend day? " + today.isWeekend());

        System.out.println("All days of the week:");
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}
