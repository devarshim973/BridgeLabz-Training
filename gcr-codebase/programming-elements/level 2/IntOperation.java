import java.util.*;

public class IntOperation {
    public static void main(String[] args) {

        // Create Scanner to take input 
        Scanner sc = new Scanner(System.in);
		
		// Take input values
        System.out.print("Enter value of a: ");
                 int  a = sc.nextInt();
		System.out.print("Enter value of b: ");
                 int b = sc.nextInt();
        System.out.print("Enter value of c: ");
                 int c = sc.nextInt();
				 
	    int result1 = a + b * c;   
        int result2 = a * b + c;  
        int result3 = c + a / b;   
        int result4 = a % b + c;   

        // Display the results
        System.out.println("The results of Int Operations are " +result1 + ", " + result2 + ", " + result3 + ", and " + result4);
		}
		}
