import java.util.Scanner;

public class StudentScoreCard {

    //  generate random 2-digit marks for PCM
    public static int[][] generateMarks(int numStudents) {
        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 40 + (int)(Math.random() * 61); // Physics: 40-100
            marks[i][1] = 40 + (int)(Math.random() * 61); // Chemistry: 40-100
            marks[i][2] = 40 + (int)(Math.random() * 61); // Math: 40-100
        }
        return marks;
    }

    //calculate total, average, and percentage
    public static double[][] calculateTotalAveragePercentage(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // 0: total, 1: average, 2: percentage
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // calculate grade based on percentage
    public static String[] calculateGrade(double[][] results) {
        int numStudents = results.length;
        String[] grades = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // display the scorecard
    public static void displayScoreCard(int[][] marks, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println(" ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2]
                    + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = generateMarks(numStudents);
        double[][] results = calculateTotalAveragePercentage(marks);
        String[] grades = calculateGrade(results);

        displayScoreCard(marks, results, grades);
    }
}
