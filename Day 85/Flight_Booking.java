import java.util.ArrayList;
import java.util.Scanner;

class Flight {
    static int idCounter = 1;
    int flightID;
    int tickets;
    int price;
    ArrayList<String> passengerDetails;
    ArrayList<Integer> passengerId;
    ArrayList<Integer> bookedTickets;
    ArrayList<Integer> passengerCost;

    public Flight() {
        flightID = idCounter++;
        tickets = 50;
        price = 5000;
        passengerDetails = new ArrayList<>();
        passengerId = new ArrayList<>();
        bookedTickets = new ArrayList<>();
        passengerCost = new ArrayList<>();
    }

    void addTicket(String passengerDetails, int noTickets, int id) {
        this.passengerDetails.add(passengerDetails);
        passengerId.add(id);
        passengerCost.add(price * noTickets);
        price += 200 * noTickets;
        tickets -= noTickets;
        bookedTickets.add(noTickets);
        System.out.println("Booked Successfully");
    }

    void cancel(int passengerID) {
        int indexToRemove = passengerId.indexOf(passengerID);
        if (indexToRemove < 0) {
            System.out.println("Passenger id not valid");
            return;
        }

        int ticketsToRemove = bookedTickets.get(indexToRemove);
        tickets += ticketsToRemove;
        price -= 200 * ticketsToRemove;
        System.out.println("Refund after successful cancel: " + passengerCost.get(indexToRemove));

        passengerDetails.remove(indexToRemove);
        passengerId.remove(indexToRemove);
        bookedTickets.remove(indexToRemove);
        passengerCost.remove(indexToRemove);
    }

    void flightSummary() {
        System.out.println("Flight id -- " + flightID + " Remaining tickets -- " + tickets + " Price -- " + price);
    }

    void printDetails() {
        System.out.println("Flight id: " + flightID);
        for (String detail : passengerDetails) {
            System.out.println(detail);
        }
    }
}

public class Main {
    static int passengerID = 1;

    static void book(Flight currentFlight, int t, int id) {
        String passenger = "Passenger Id" + id + " Ticket " + t + " Price " + currentFlight.price * t;
        currentFlight.addTicket(passenger, t, id);
        currentFlight.flightSummary();
        currentFlight.printDetails();
    }

    static void cancel(Flight currentFlight, int id) {
        currentFlight.cancel(id);
        currentFlight.flightSummary();
        currentFlight.printDetails();
    }

    public static void print(Flight f) {
        f.printDetails();
    }

    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        for (int i = 0; i < 3; i++) { // Adjust the number of flights as needed
            flights.add(new Flight());
        }

        while (true) {
            System.out.println("1. Book 2. Cancel 3. Print");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Select Flight");
                    int fid = sc.nextInt();
                    if (fid > flights.size() || fid <= 0) {
                        System.out.println("Invalid flight ID");
                        break;
                    }

                    Flight currentFlight = flights.get(fid - 1);
                    currentFlight.flightSummary();

                    System.out.println("Enter number of tickets");
                    int t = sc.nextInt();
                    if (t > currentFlight.tickets) {
                        System.out.println("Not Enough Tickets");
                        break;
                    }

                    book(currentFlight, t, passengerID);
                    passengerID++;
                    break;
                }
                case 2: {
                    System.out.println("Select Flight");
                    int fid = sc.nextInt();
                    if (fid > flights.size() || fid <= 0) {
                        System.out.println("Invalid flight ID");
                        break;
                    }

                    Flight currentFlight = flights.get(fid - 1);
                    currentFlight.flightSummary();

                    System.out.println("Enter passenger ID to cancel");
                    int id = sc.nextInt();
                    cancel(currentFlight, id);
                    break;
                }
                case 3: {
                    for (Flight f : flights) {
                        if (f.passengerDetails.size() == 0) {
                            System.out.println("No passenger Details for - Flight " + f.flightID);
                        } else {
                            print(f);
                        }
                    }
                    break;
                }
                default:
                    break;
            }
        }
    }
}
