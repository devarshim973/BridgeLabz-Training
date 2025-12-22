import java.util.Scanner;

public class BMICalculator {

    // calculate BMI and return as string with 2 decimal places
    public static String calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm to meters
        double bmi = weightKg / (heightM * heightM);
        return String.format("%.2f", bmi);
    }

    //  determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    // compute BMI and status for all members
    public static String[][] computeBMIStatus(double[][] heightWeight) {
        int n = heightWeight.length;
        String[][] result = new String[n][4]; // Columns: Weight, Height, BMI, Status

        for (int i = 0; i < n; i++) {
            double weight = heightWeight[i][0];
            double height = heightWeight[i][1];
            double bmiVal = weight / ((height / 100.0) * (height / 100.0));
            String bmi = String.format("%.2f", bmiVal);
            String status = determineBMIStatus(bmiVal);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = bmi;
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the result in a tabular format
    public static void displayBMIResults(String[][] bmiData) {
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",
                    (i+1), bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMembers = 10;
        double[][] heightWeight = new double[numMembers][2]; // Column 0: weight, Column 1: height

        // Input weight and height
        for (int i = 0; i < numMembers; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            heightWeight[i][1] = sc.nextDouble();
        }

        // Compute BMI and status
        String[][] bmiData = computeBMIStatus(heightWeight);

        // Display results
        displayBMIResults(bmiData);
    }
}
