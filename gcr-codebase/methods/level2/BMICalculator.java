import java.util.Scanner;

public class BMICalculator {

    //  calculate BMI and store it in the 3rd column
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];      // weight in kg
            double heightCm = data[i][1];    // height in cm

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            //formula: weight / (height * height)
            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;   // store BMI in 3rd column
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        // Taking user input
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter details of person " + (i + 1));

            System.out.print("Weight (in kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (in cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        // Get BMI Status
        String[] bmiStatus = getBMIStatus(persons);

        // Display results
        System.out.println(" BMI Report ");
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    (i + 1),
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    bmiStatus[i]);
        }

    }
}
