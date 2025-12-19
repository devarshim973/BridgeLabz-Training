import java.util.Scanner;

public class StudentGradeCalculation {
    public static void main(String[] args) {
     //create scanner to take input
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();

            System.out.print("Maths: ");
            maths[i] = input.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
                i--; // decrement index to re-enter data
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nSTUDENT REPORT ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}
