import java.util.*;

public class SumUntilZero{
    public static void main(String[] args){
	
	 //create scanner class
	 Scanner sc = new Scanner(System.in);
	 
	 // Initialize total sum
        double total = 0.0;
		
		// Ask for first input
        System.out.print("Enter a number : ");
        double number = sc.nextDouble();
		
		while(number!=0){
		total= total+number;
		System.out.println("again enter any number");
		number =sc.nextDouble();
		}
		System.out.println(total);
		}
		}