import java.util.Random;

public class ZaraEmployeeBonus {

    // Constant for number of employees
    static final int EMPLOYEES = 10;

    /*
     * Method to generate salary and years of service
     * Column 0 → Salary
     * Column 1 → Years of Service
     */
    public static double[][] generateEmployeeData() {
        double[][] data = new double[EMPLOYEES][2];
        Random random = new Random();

        for (int i = 0; i < EMPLOYEES; i++) {
            // 5-digit salary between 10000 and 99999
            data[i][0] = 10000 + random.nextInt(90000);

            // Years of service between 1 and 10
            data[i][1] = 1 + random.nextInt(10);
        }
        return data;
    }

    /*
     * Method to calculate new salary and bonus
     * Column 0 → Old Salary
     * Column 1 → Years of Service
     * Column 2 → Bonus Amount
     * Column 3 → New Salary
     */
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] result = new double[EMPLOYEES][4];

        for (int i = 0; i < EMPLOYEES; i++) {
            double oldSalary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }
        return result;
    }

   
     // Method to calculate and display totals in tabular format
   
    public static void displaySummary(double[][] salaryData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("");
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Employee", "Old Salary", "Bonus", "New Salary");
        System.out.println("");

        for (int i = 0; i < EMPLOYEES; i++) {
            totalOldSalary += salaryData[i][0];
            totalBonus += salaryData[i][2];
            totalNewSalary += salaryData[i][3];

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f%n",
                    (i + 1),
                    salaryData[i][0],
                    salaryData[i][2],
                    salaryData[i][3]);
        }

        System.out.println("");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f%n",
                "TOTAL",
                totalOldSalary,
                totalBonus,
                totalNewSalary);
        System.out.println(" ");
    }

    // Main Method
    public static void main(String[] args) {

        // Step 1: Generate salary and service data
        double[][] employeeData = generateEmployeeData();

        // Step 2: Calculate bonus and new salary
        double[][] salaryResult = calculateBonus(employeeData);

        // Step 3: Display summary in tabular format
        displaySummary(salaryResult);
    }
}
