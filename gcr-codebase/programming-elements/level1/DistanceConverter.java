import java.util.*;

public class DistanceConverter {
    public static void main(String[] args) {

        // Create Scanner to take input 
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter distance in feet: ");
           double distanceInFeet = sc.nextDouble();
		   
		    // Convert feet to yards
               double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles
              double distanceInMiles = distanceInYards / 1760;
			  
			   System.out.println("Distance in feet is " + distanceInFeet+" while in yards is " + distanceInYards + " and in miles is " + distanceInMiles );

    
}
}