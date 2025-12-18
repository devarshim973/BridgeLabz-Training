import java.util.*;

public class MultiplicationTableusewhile {
    public static void main(String[] args) {
       //create a scanner class take input
        Scanner sc = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		//check positive number
		if(number>0){
		
		int i=1;
		while(i<=number){
		if(i%3==0 && i%5==0){
		System.out.println("FizzBuzz");
		}
		// Check multiples of 3
		else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
				// Check multiples of 5
        else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
        else {
                    System.out.println(i);
                }
				i++;
				}
				} 
				
				}
				}
				