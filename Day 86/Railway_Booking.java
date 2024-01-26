import java.util.*;

public class Main {

    public static void bookTicket(Passenger p, TicketBooker booker) {
        if (TicketBooker.availableWaitingList == 0) {
            System.out.println("No Tickets Available");
            return;
        }

        if ((p.berthPreference.equals("L") && TicketBooker.availableLowerBerths > 0) ||
                (p.berthPreference.equals("M") && TicketBooker.availableMiddleBerths > 0) ||
                (p.berthPreference.equals("U") && TicketBooker.availableUpperBerths > 0)) {
            System.out.println("Preferred Berth Available");
            bookPreferredBerth(p, booker);
        } else if (TicketBooker.availableLowerBerths > 0) {
            System.out.println("Lower Berth Given");
            booker.bookTicket(p, TicketBooker.lowerBerthsPositions, "L");
        } else if (TicketBooker.availableMiddleBerths > 0) {
            System.out.println("Middle Berth Given");
            booker.bookTicket(p, TicketBooker.middleBerthsPositions, "M");
        } else if (TicketBooker.availableUpperBerths > 0) {
            System.out.println("Upper Berth Given");
            booker.bookTicket(p, TicketBooker.upperBerthsPositions, "U");
        } else if (TicketBooker.availableRacTickets > 0) {
            System.out.println("RAC available");
            booker.addToRAC(p, TicketBooker.racPositions, "RAC");
        } else if (TicketBooker.availableWaitingList > 0) {
            System.out.println("Added to Waiting List");
            booker.addToWaitingList(p, TicketBooker.waitingListPositions, "WL");
        }
    }

    private static void bookPreferredBerth(Passenger p, TicketBooker booker) {
        System.out.println("Preferred Berth Available");
        if (p.berthPreference.equals("L")) {
            System.out.println("Lower Berth Given");
            booker.bookTicket(p, TicketBooker.lowerBerthsPositions, "L");
        } else if (p.berthPreference.equals("M")) {
            System.out.println("Middle Berth Given");
            booker.bookTicket(p, TicketBooker.middleBerthsPositions, "M");
        } else if (p.berthPreference.equals("U")) {
            System.out.println("Upper Berth Given");
            booker.bookTicket(p, TicketBooker.upperBerthsPositions, "U");
        }
    }

    public static void cancelTicket(int id, TicketBooker booker) {
        if (!booker.passengers.containsKey(id)) {
            System.out.println("Passenger detail Unknown");
        } else {
            booker.cancelTicket(id);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean loop = true;
        TicketBooker booker = new TicketBooker();

        while (loop) {
            System.out.println(" 1. Book Ticket \n 2. Cancel Ticket \n 3. Available Tickets \n 4. Booked Tickets \n 5. Exit");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Passenger name, age, and berth preference (L,M or U)");
                    String name = s.next();
                    int age = s.nextInt();
                    String berthPreference = s.next();
                    Passenger p = new Passenger(name, age, berthPreference);
                    bookTicket(p, booker);
                    break;
                case 2:
                    System.out.println("Enter passenger Id to cancel");
                    int id = s.nextInt();
                    cancelTicket(id, booker);
                    break;
                case 3:
                    booker.printAvailable();
                    break;
                case 4:
                    booker.printPassengers();
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}

class Passenger {
    static int id = 1;
    String name;
    int age;
    String berthPreference;
    int passengerId;
    String alloted;
    int number;

    public Passenger(String name, int age, String berthPreference) {
        this.name = name;
        this.age = age;
        this.berthPreference = berthPreference;
        this.passengerId = id++;
        alloted = "";
        number = -1;
    }
}

class TicketBooker {
    static int availableLowerBerths = 1;
    static int availableMiddleBerths = 1;
    static int availableUpperBerths = 1;
    static int availableRacTickets = 1;
    static int availableWaitingList = 1;

    static Queue<Integer> waitingList = new LinkedList<>();
    static Queue<Integer> racList = new LinkedList<>();
    static List<Integer> bookedTicketList = new ArrayList<>();

    static List<Integer> lowerBerthsPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> middleBerthsPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> upperBerthsPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> racPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> waitingListPositions = new ArrayList<>(Arrays.asList(1));

    static Map<Integer, Passenger> passengers = new HashMap<>();

    public void bookTicket(Passenger p, List<Integer> berthPositions, String allottedBerth) {
        p.number = berthPositions.get(0);
        p.alloted = allottedBerth;
        passengers.put(p.passengerId, p);
        bookedTicketList.add(p.passengerId);

        System.out.println("--------------------------Booked Successfully");
        decreaseAvailableSeats(p.alloted);
        berthPositions.remove(0);
    }

    public void addToRAC(Passenger p, List<Integer> racPositions, String allottedRAC) {
        p.number = racPositions.get(0);
        p.alloted = allottedRAC;
        passengers.put(p.passengerId, p);
        racList.add(p.passengerId);
        availableRacTickets--;

        System.out.println("--------------------------Added to RAC Successfully");
        racPositions.remove(0);
    }

    public void addToWaitingList(Passenger p, List<Integer> waitingListPositions, String allottedWL) {
        p.number = waitingListPositions.get(0);
        p.alloted = allottedWL;
        passengers.put(p.passengerId, p);
        waitingList.add(p.passengerId);
        availableWaitingList--;

        System.out.println("--------------------------Added to Waiting List Successfully");
        waitingListPositions.remove(0);
    }

    public void cancelTicket(int passengerId) {
        Passenger p = passengers.get(passengerId);
        passengers.remove(passengerId);
        bookedTicketList.remove(Integer.valueOf(passengerId));

        int positionBooked = p.number;
        System.out.println("---------------Cancelled Successfully");

        increaseAvailableSeats(p.alloted, positionBooked);

        if (racList.size() > 0) {
            Passenger passengerFromRAC = passengers.get(racList.poll());
            int positionRac = passengerFromRAC.number;
            racPositions.add(positionRac);
            racList.remove(Integer.valueOf(passengerFromRAC.passengerId));
            availableRacTickets++;

            if (waitingList.size() > 0) {
                Passenger passengerFromWaitingList = passengers.get(waitingList.poll());
                int positionWL = passengerFromWaitingList.number;
                waitingListPositions.add(positionWL);
                waitingList.remove(Integer.valueOf(passengerFromWaitingList.passengerId));

                passengerFromWaitingList.number = racPositions.get(0);
                passengerFromWaitingList.alloted = "RAC";
                racPositions.remove(0);
                racList.add(passengerFromWaitingList.passengerId);

                availableWaitingList++;
                availableRacTickets--;
            }

            bookTicket(passengerFromRAC, this);
        }
    }

    public void printAvailable() {
        System.out.println("Available Lower Berths " + availableLowerBerths);
        System.out.println("Available Middle Berths " + availableMiddleBerths);
        System.out.println("Available Upper Berths " + availableUpperBerths);
        System.out.println("Available RACs " + availableRacTickets);
        System.out.println("Available Waiting List " + availableWaitingList);
        System.out.println("--------------------------");
    }

    public void printPassengers() {
        if (passengers.size() == 0) {
            System.out.println("No details of passengers");
            return;
        }
        for (Passenger p : passengers.values()) {
            System.out.println("PASSENGER ID " + p.passengerId);
            System.out.println(" Name " + p.name);
            System.out.println(" Age " + p.age);
            System.out.println(" Status " + p.number + p.alloted);
            System.out.println("--------------------------");
        }
    }

    private void decreaseAvailableSeats(String allotment) {
        switch (allotment) {
            case "L":
                availableLowerBerths--;
                break;
            case "M":
                availableMiddleBerths--;
                break;
            case "U":
                availableUpperBerths--;
                break;
            default:
                break;
        }
    }

    private void increaseAvailableSeats(String allotment, int position) {
        switch (allotment) {
            case "L":
                availableLowerBerths++;
                lowerBerthsPositions.add(position);
                break;
            case "M":
                availableMiddleBerths++;
                middleBerthsPositions.add(position);
                break;
            case "U":
                availableUpperBerths++;
                upperBerthsPositions.add(position);
                break;
            default:
                break;
        }
    }
}
