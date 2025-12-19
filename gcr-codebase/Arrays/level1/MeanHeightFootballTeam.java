import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create array of size 
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for heights
        System.out.println("Enter heights of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i+1) + " height: ");
            heights[i] = sc.nextDouble();
        }
         // Calculate sum of heights
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        System.out.println("\nMean height of the football team = " + mean + " cm");

    }
}
