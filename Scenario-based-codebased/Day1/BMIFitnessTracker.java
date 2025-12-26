// a Java program that takes height and weight as input, calculates BMI using the formula BMI= weight / (height * height)
 //prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. 


import java.util.Scanner;

public class BMIFitnessTracker {

    //  calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    //  find BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else {
            return "Overweight";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        // Calculating BMI
        double bmi = calculateBMI(weight, height);

        // Finding BMI category
        String category = getBMICategory(bmi);

        // Displaying result
        System.out.println("BMI Value: " + bmi);
        System.out.println("BMI Category: " + category);

        sc.close();
    }
}
