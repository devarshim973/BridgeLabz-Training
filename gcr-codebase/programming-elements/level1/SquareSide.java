import java.util.*;

public class SquareSide {
    public static void main(String[] args) {

        // Create Scanner to take input 
        Scanner sc = new Scanner(System.in);
		
		// Take perimeter of the square as input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
		
		//claculate side of the square
		 double side = perimeter / 4;
		 
		  System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter );

    }
	}