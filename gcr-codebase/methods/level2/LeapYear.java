import java.util.Scanner;

public class LeapYear {

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {

        // Leap year for calendar
        if (year < 1582) {
            return false;
        }

        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Calling method
        boolean result = isLeapYear(year);

        if (result) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

    }
}
