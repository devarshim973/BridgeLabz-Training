import java.util.Scanner;

public class ParkingLotSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = 5;    
        int occupied = 0;      
        int choice;

        // Loop continues until parking lot is full or user exits
        while (occupied < capacity) {

            System.out.println(" Parking Lot ");
            System.out.println("1. Park Car");
            System.out.println("2. Exit Car");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Car parked successfully.");
                    } else {
                        System.out.println("Parking lot is full!");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car exited successfully.");
                    } else {
                        System.out.println("Parking lot is empty!");
                    }
                    break;

                case 3:
                    System.out.println("Occupied slots: " + occupied);
                    System.out.println("Available slots: " + (capacity - occupied));
                    break;

                case 4:
                    System.out.println("Exiting system. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            if (occupied == capacity) {
                System.out.println("\nParking lot is FULL. System stopping.");
            }
        }

    }
}
