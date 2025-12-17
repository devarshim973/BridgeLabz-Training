import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {

        // Create Scanner to take input 
        Scanner sc = new Scanner(System.in);
		
		// Take input values
        System.out.print("Enter value of a: ");
                 double  a = sc.nextDouble();
		System.out.print("Enter value of b: ");
                double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
                 double c = sc.nextDouble();
				 
		 // Perform integer operations		 
	    double result1 = a + b * c;   
        double result2 = a * b + c;  
        double result3 = c + a / b;   
        double result4 = a % b + c;   

        // Display the results
        System.out.println("The results of Int Operations are " +result1 + ", " + result2 + ", " + result3 + ", and " + result4);
		}
		}