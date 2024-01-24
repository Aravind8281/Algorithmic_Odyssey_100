import java.util.ArrayList;
import java.util.Scanner;

class Exercise {
    private String name;
    private int duration;
    public Exercise(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return name + " (" + duration + " minutes)";
    }
}
class Diet {
    private String food;
    private int calories;
    public Diet(String food, int calories) {
        this.food = food;
        this.calories = calories;
    }
    @Override
    public String toString() {
        return food + " (" + calories + " calories)";
    }
}
class HealthTracker {
    private ArrayList<Exercise> exercises;
    private ArrayList<Diet> diets;
    public HealthTracker() {
        exercises = new ArrayList<>();
        diets = new ArrayList<>();
    }
    public void addExercise(String name, int duration) {
        Exercise exercise = new Exercise(name, duration);
        exercises.add(exercise);
        System.out.println("Exercise added: " + exercise);
    }
    public void addDiet(String food, int calories) {
        Diet diet = new Diet(food, calories);
        diets.add(diet);
        System.out.println("Diet added: " + diet);
    }
    public void displayExerciseHistory() {
        System.out.println("Exercise History:");
        for (Exercise exercise : exercises) {
            System.out.println(exercise);
        }
    }
    public void displayDietHistory() {
        System.out.println("Diet History:");
        for (Diet diet : diets) {
            System.out.println(diet);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HealthTracker healthTracker = new HealthTracker();
        while (true) {
            System.out.println("\nHealth Tracker Menu:");
            System.out.println("1. Add Exercise");
            System.out.println("2. Add Diet");
            System.out.println("3. Display Exercise History");
            System.out.println("4. Display Diet History");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter exercise name: ");
                    String exerciseName = scanner.next();
                    System.out.print("Enter exercise duration (minutes): ");
                    int exerciseDuration = scanner.nextInt();
                    healthTracker.addExercise(exerciseName, exerciseDuration);
                    break;
                case 2:
                    System.out.print("Enter food name: ");
                    String foodName = scanner.next();
                    System.out.print("Enter calories: ");
                    int calories = scanner.nextInt();
                    healthTracker.addDiet(foodName, calories);
                    break;
                case 3:
                    healthTracker.displayExerciseHistory();
                    break;
                case 4:
                    healthTracker.displayDietHistory();
                    break;
                case 5:
                    System.out.println("Exiting the Health Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
