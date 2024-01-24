import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;
    private double rentalRate;
    private boolean available;

    public Car(String make, String model, int year, double rentalRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalRate = rentalRate;
        this.available = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ")";
    }
}

class CarRentalSystem {
    private ArrayList<Car> cars;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2022, 50.0));
        cars.add(new Car("Honda", "Accord", 2021, 55.0));
        cars.add(new Car("Ford", "Fusion", 2020, 48.0));
    }
    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
            }
        }
    }
    public void rentCar(int index) {
        if (index >= 0 && index < cars.size()) {
            Car selectedCar = cars.get(index);
            if (selectedCar.isAvailable()) {
                System.out.println("Renting: " + selectedCar);
                selectedCar.setAvailable(false);
            } else {
                System.out.println("Sorry, the selected car is not available for rent.");
            }
        } else {
            System.out.println("Invalid car index.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRentalSystem rentalSystem = new CarRentalSystem();
        while (true) {
            System.out.println("\nCar Rental System Menu:");
            System.out.println("1. Display Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    rentalSystem.displayAvailableCars();
                    break;
                case 2:
                    System.out.print("Enter the index of the car you want to rent: ");
                    int carIndex = scanner.nextInt();
                    rentalSystem.rentCar(carIndex);
                    break;
                case 3:
                    System.out.println("Exiting the Car Rental System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
