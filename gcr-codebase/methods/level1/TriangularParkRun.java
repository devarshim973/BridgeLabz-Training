import java.util.Scanner;

public class TriangularParkRun {

    //  calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;   
        double totalDistance = 5;                

        return totalDistance / perimeter;
		}
		 public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter first side1");
		  double side1 = sc.nextDouble();
		  
		   System.out.println("enter second side2");
		  double side2 = sc.nextDouble();
		  
		  System.out.println("enter third side3");
		  double side3 = sc.nextDouble();
		  
		  double rounds = calculateRounds(side1, side2, side3);
		  
		  System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
		  }
		  }
		  
		  