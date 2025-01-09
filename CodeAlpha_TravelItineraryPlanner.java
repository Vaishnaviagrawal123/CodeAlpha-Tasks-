// task 3
import java.util.ArrayList;
import java.util.Scanner;

class Destination {
    String name;
    String date;
    String preference;
    double budget;

    Destination(String name, String date, String preference, double budget) {
        this.name = name;
        this.date = date;
        this.preference = preference;
        this.budget = budget;
    }

    public void displayInfo() {
        System.out.println("Destination: " + name);
        System.out.println("Date: " + date);
        System.out.println("Preference: " + preference);
        System.out.println("Budget: $" + budget);
    }
}

public class CodeAlpha_TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Destination> itinerary = new ArrayList<>();
        double totalBudget = 0;
        String choice;

        System.out.println("Travel Itinerary Planner");
        
        do {
            System.out.print("Enter destination name: ");
            String name = scanner.nextLine();
            System.out.print("Enter date (e.g., 2024-07-10): ");
            String date = scanner.nextLine();
            System.out.print("Enter preference (e.g., sightseeing, adventure, relaxation): ");
            String preference = scanner.nextLine();
            System.out.print("Enter budget for this destination: ");
            double budget = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            itinerary.add(new Destination(name, date, preference, budget));
            totalBudget += budget;

            System.out.print("Do you want to add another destination? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nYour Travel Itinerary:");
        for (Destination d : itinerary) {
            d.displayInfo();
            System.out.println();
        }
        
        System.out.println("Total Budget: $" + totalBudget);
        System.out.println("Weather and Maps integration can be added in a future version.");

        scanner.close();
    }
}
