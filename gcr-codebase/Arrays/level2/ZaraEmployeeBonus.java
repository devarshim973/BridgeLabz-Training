import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = input.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid values again.\n");
                i--; // decrement index to re-enter data
                continue;
            }

            System.out.println();
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            // Bonus calculation based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;   // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;   // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Add to totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Final output
        System.out.println("-------- Zara Company Bonus Summary --------");
        System.out.println("Total Old Salary of all Employees: INR " + totalOldSalary);
        System.out.println("Total Bonus Payout: INR " + totalBonus);
        System.out.println("Total New Salary after Bonus: INR " + totalNewSalary);
    }
}
