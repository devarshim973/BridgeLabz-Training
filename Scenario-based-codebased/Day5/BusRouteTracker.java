import java.util.Scanner;

public class BusRouteTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stopNumber = 1;
        int distancePerStop = 5; // distance in km per stop
        int totalDistance = 0;
        char getOff;

        System.out.println("Welcome to the Bus Route Tracker!");

        while(true) {
            // Add distance for current stop
            totalDistance += distancePerStop;
            System.out.println("Stop " + stopNumber + " reached. Total distance: " + totalDistance + " km.");

            // Ask passenger if they want to get off
            System.out.print("Do you want to get off at this stop? (y/n): ");
            getOff = sc.next().charAt(0);

            if(getOff == 'y' || getOff == 'Y') {
                System.out.println("You got off at stop " + stopNumber + ". Total distance traveled: " + totalDistance + " km.");
                break; // exit loop
            }

            stopNumber++; // move to next stop
        }

        System.out.println("Thank you for traveling with us!");

    }
}
