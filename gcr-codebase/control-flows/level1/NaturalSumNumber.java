import java.util.*;

public class NaturalSumNumber{
    public static void main(String[] args){
	
	 //create scanner to take input
	 Scanner sc = new Scanner(System.in);
	 
	  System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		if (number > 0) {
 // Calculate sum of n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);

        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
		}
		}