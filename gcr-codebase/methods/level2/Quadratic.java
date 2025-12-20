import java.util.Scanner;

public class Quadratic {

    //find roots of quadratic equation
 
    public static double[] findRoots(double a, double b, double c) {

        // Calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is negative, return empty array
        if (delta < 0) {
            return new double[0];
        }

        // If delta is zero, one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is positive, two roots
        double sqrtDelta = Math.sqrt(delta);

        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Calling method
        double[] roots = findRoots(a, b, c);

        // Display result
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        }

    }
}
