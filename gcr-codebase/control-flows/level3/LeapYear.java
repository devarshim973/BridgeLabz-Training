import java.util.*;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Gregorian calendar condition
        if (year >= 1582) {

            // Multiple if-else 
            if (year % 400 == 0) {
                System.out.println("PART 1: Year is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println("PART 1: Year is not a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println("PART 1: Year is a Leap Year");
            } 
            else {
                System.out.println("PART 1: Year is not a Leap Year");
            }

           // Single if with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("PART 2: Year is a Leap Year");
            } else {
                System.out.println("PART 2: Year is not a Leap Year");
            }

        } else {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        }
    }
}
