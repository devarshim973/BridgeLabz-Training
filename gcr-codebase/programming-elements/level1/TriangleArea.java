import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner to take input 
        Scanner input = new Scanner(System.in);
		
		// Take base as input (in inches)
		 System.out.print("Enter the base of the triangle (in inches): ");
             double base = input.nextDouble();
	    System.out.print("Enter the height of the triangle (in inches): ");
             double height = input.nextDouble();
	    
		// Calculate area in square inches
             double  areaInSquareInches = 0.5 * base * height;

        // Convert area to square centimeters
           double areaInSquareCentimeters = areaInSquareInches * 6.4516;
      
	  // Display the result
        System.out.println("Area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCentimeters +" square centimeters" );

        // Close the scanner
        input.close();
    }
}
	   