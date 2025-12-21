import java.util.Scanner;

public class EuclideanDistanceAndLine {

    // Method to find Euclidean distance between two points
    public static double findEuclideanDistance(double x1, double y1,
                                                double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // Method to find slope 
    public static double[] findLineEquation(double x1, double y1,
                                             double x2, double y2) {

        double[] result = new double[2];

        // Slope m
        double m = (y2 - y1) / (x2 - x1);

        // Y-intercept b
        double b = y1 - (m * x1);

        result[0] = m;
        result[1] = b;

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);

        // Calculate line equation
        double[] line = findLineEquation(x1, y1, x2, y2);

        // Display results
        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Equation of the Line:");
        System.out.println("y = " + line[0] + "x + " + line[1]);

    }
}
