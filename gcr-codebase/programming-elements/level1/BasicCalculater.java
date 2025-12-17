import java.util.*;

public class BasicCalculater{
   public static void main(String[] args){
   //initialize scanner class for taking user inputs
   Scanner input = new Scanner(System.in);
   
   //Initialize number1 and number2 take inputs
   System.out.print("Enter first number: ");
   int number1 = input.nextInt();
   System.out.print("Enter second number: ");
    int number2 = input.nextInt();
	
	//perform addition(+),subtraction(-),multiplication(*),division(/)
	int addition = number1 + number2;
    int subtraction = number1 - number2;
    int multiplication = number1 * number2;
    int division = number1 / number2;
	
	// Display the results
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers "
            + number1 + " and " + number2 + " is "
            + addition + ", " + subtraction + ", "
            + multiplication + ", and " + division
        );

        // Close the scanner
        input.close();
    }
}
	