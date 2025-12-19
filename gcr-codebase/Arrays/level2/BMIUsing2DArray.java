import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2D array to store height, weight, and BMI
        double[][] personData = new double[number][3];

        String[] weightStatus = new String[number];

        // Take input for height and weight with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Height input validation
            while (true) {
                System.out.print("Enter height in meters: ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] > 0)
                    break;
                System.out.println("Height must be positive. Please re-enter.");
            }

            // Weight input validation
            while (true) {
                System.out.print("Enter weight in kilograms: ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] > 0)
                    break;
                System.out.println("Weight must be positive. Please re-enter.");
            }
        }

        for (int i = 0; i < number; i++) {

            double height = personData[i][0];
            double weight = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display BMI report
        System.out.println("\nBMI REPORT ");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
