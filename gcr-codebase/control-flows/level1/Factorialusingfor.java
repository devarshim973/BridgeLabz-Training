import java.util.*;

public class Factorialusingfor {
    public static void main(String[] args) {

        // Create Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		if(number<0){
			System.out.println("factorial is not defined for negative number");
		}
		else{
			long fact =1;
			
		
	
		for(int i=1;i<=number;i++){
		fact= fact*i;

		}
		System.out.println("factorial of"+ number+ "is"+fact);
		}
		}
}