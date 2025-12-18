import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		//check positive number
		if(number>0){
		
		for(int i=1;i<=number;i++){
		if(i%3==0 && i%5==0){
		System.out.println("FizzBuzz");
		}
		else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
        else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
        else {
                    System.out.println(i);
                }
				}
				} 
				//System.out.println("Please enter a positive integer.");
				}
				}
				