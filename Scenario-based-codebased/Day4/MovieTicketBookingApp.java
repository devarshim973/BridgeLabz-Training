import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 1;

        while (choice == 1) {

            int ticketPrice = 0;
            int snackPrice = 0;

            // Movie type
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.print("Enter choice: ");
            int movieType = sc.nextInt();

            switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 150;
                    break;
                case 3:
                    ticketPrice = 180;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }

            // Seat type
            System.out.print("Select Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            // Snacks option
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            int totalBill = ticketPrice + snackPrice;

            // Display bill
            System.out.println("\n--- Booking Summary ---");
            System.out.println("Ticket Price: ₹" + ticketPrice);
            System.out.println("Snacks Price: ₹" + snackPrice);
            System.out.println("Total Bill: ₹" + totalBill);

            // Next customer
            System.out.println("\n1. Next Customer");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
        }

        System.out.println("\nThank you for using Movie Ticket Booking App!");
        sc.close();
    }
}
