import java.util.Scanner;

public class TrigonometricFunctions {

    // calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calling the method
        double[] result = calculateTrigonometricFunctions(angle);

        // Displaying results
        System.out.println("Sine value: " + result[0]);
        System.out.println("Cosine value: " + result[1]);
        System.out.println("Tangent value: " + result[2]);

    }
}
