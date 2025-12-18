import java.util.*;

public class LeapYearSingleIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Single if condition using logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

    }
}
