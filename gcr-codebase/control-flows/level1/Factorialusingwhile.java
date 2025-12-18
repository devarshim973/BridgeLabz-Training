import java.util.*;

public class Factorialusingwhile {
    public static void main(String[] args) {

        // Create Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		int fact=1;
		
		int temp=number;
		while(temp!=0){
		fact= fact*temp;
		temp--;
		}
		System.out.println("factorial of"+ number+ "is"+fact);
		}
		}
		