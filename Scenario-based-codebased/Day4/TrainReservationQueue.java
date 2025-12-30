import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;
        int choice;

        while (totalSeats > 0) {

            System.out.println("\n--- Train Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Show Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of seats to book: ");
                    int bookSeats = sc.nextInt();

                    if (bookSeats <= totalSeats) {
                        totalSeats = totalSeats - bookSeats;
                        System.out.println("Booking successful!");
                    } else {
                        System.out.println("Not enough seats available.");
                    }
                    break;

                case 2:
                    System.out.println("Available seats: " + totalSeats);
                    break;

                case 3:
                    System.out.println("Exiting reservation system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

            if (totalSeats == 0) {
                System.out.println("\nAll seats are booked. Reservation closed.");
                break;
            }
        }

    }
}
