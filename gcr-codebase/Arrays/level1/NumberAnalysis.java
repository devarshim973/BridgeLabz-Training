import java.util.*;


//a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero
public class NumberAnalysis {
    public static void main(String[] args) {
      
	   //create scanner object
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
		
		 for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter numbers: ");
            numbers[i] = sc.nextInt();
        }
		 for (int i = 0; i < numbers.length; i++) {

		 if(numbers[i]>0){
		    if(numbers[i]%2==0){
			   System.out.println(numbers[i]+" no is positive and even");
			  } else{
			   System.out.println(numbers[i]+" no is positive and odd");
			   }
			   }
		else if(numbers[i]<0){
		     System.out.println(numbers[i]+"number is negative");
			 }
		else{
		System.out.println(numbers[i]+" no is zero");
		}
		}
		//Compare first and last elements
		int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\n--- Comparison of First and Last Element ---");

        if (first == last) {
            System.out.println("First element (" + first + ") is equal to Last element (" + last + ")");
        } 
        else if (first > last) {
            System.out.println("First element (" + first + ") is greater than Last element (" + last + ")");
        } 
        else {
            System.out.println("First element (" + first + ") is less than Last element (" + last + ")");
        }

		}
		}