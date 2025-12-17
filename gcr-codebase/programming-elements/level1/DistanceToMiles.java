import java.util.*;

public class DistanceToMiles{
	public static void main(String[] args){
		Double km;
		Double miles;
		//create a scanner with name 'input'
		Scanner input= new Scanner(System.in);
		System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
		
		 // Conversion formula (1 mile = 1.6 km)
        miles = km * 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}

