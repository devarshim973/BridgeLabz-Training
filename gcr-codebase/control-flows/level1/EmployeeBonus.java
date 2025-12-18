import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take salary input from user
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
             System.out.println("Bonus amount is: " + bonus);

        } else {
            System.out.println("No bonus. Years of service is 5 or less.");
        }

        sc.close();
    }
}