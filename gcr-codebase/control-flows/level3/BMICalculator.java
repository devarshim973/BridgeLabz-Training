import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Take user input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        double bmi = weight / (heightMeter * heightMeter);

        String status;

        //  Determine BMI status
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("\n----- BMI RESULT -----");
        System.out.println("BMI Value     : " + bmi);
        System.out.println("Weight Status : " + status);

    }
}
