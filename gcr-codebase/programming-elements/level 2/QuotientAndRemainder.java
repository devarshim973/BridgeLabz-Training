import java.util.*;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        // Create Scannerto take input
        Scanner sc = new Scanner(System.in);
		
		 // Take number as input
        System.out.print("Enter first number: ");
         int  number1 = sc.nextInt();
        System.out.print("Enter second number: ");
         int number2 = sc.nextInt();
		 
		 // Calculate quotient using division operator
        int quotient = number1 / number2;

        // Calculate remainder using modulus operator
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +" of two number " + number1 + " and " + number2 );
    }
}







