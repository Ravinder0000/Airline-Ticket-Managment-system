import java.util.Random;
import java.util.Scanner;

public class airline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Prompt user for name and other details
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // consume the newline character

        System.out.print("Enter your gender (M/F/O): ");
        char gender = input.nextLine().charAt(0);

        System.out.print("Enter your departure city: ");
        String departureCity = input.nextLine();

        System.out.print("Enter your destination city: ");
        String destinationCity = input.nextLine();

        // Prompt user to select departure time
        System.out.println("Select your departure time:");
        System.out.println("1. 8:00 AM");
        System.out.println("2. 12:00 PM");
        System.out.println("3. 4:00 PM");
        int choice = input.nextInt();
        String departureTime;
        switch (choice) {
            case 1:
                departureTime = "8:00 AM";
                break;
            case 2:
                departureTime = "12:00 PM";
                break;
            case 3:
                departureTime = "4:00 PM";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to 8:00 AM.");
                departureTime = "8:00 AM";
        }

        // Generate random ticket number
        int ticketNumber = rand.nextInt(1000000);

        // Print ticket details
        System.out.println("\nTicket Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Departure City: " + departureCity);
        System.out.println("Destination City: " + destinationCity);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Ticket Number: " + ticketNumber);
    }
}
