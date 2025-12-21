import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearBySlope(int x1, int y1,
                                              int x2, int y2,
                                              int x3, int y3) {

        return (y2 - y1) * (x3 - x2) ==
               (y3 - y2) * (x2 - x1) &&
               (y2 - y1) * (x3 - x1) ==
               (y3 - y1) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearByArea(int x1, int y1,
                                             int x2, int y2,
                                             int x3, int y3) {

        double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));

        return area == 0;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for 3 points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Checking collinearity using slope method
        boolean slopeResult = isCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Checking collinearity using area method
        boolean areaResult = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("\nUsing Slope Formula:");
        if (slopeResult) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are NOT collinear.");
        }

        System.out.println("\nUsing Area of Triangle Formula:");
        if (areaResult) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are NOT collinear.");
        }

    }
}
