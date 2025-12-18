import java.util.*;

public class CheckNumberSign{
    public static void main(String[] args){
	
	 //create scanner to take input
	 Scanner sc = new Scanner(System.in);
	 
	  // Take number input from user
	  System.out.print("Enter number ");
        int number = sc.nextInt();
		
		if(number>0){
		System.out.println("number is positive");
		}
		else if(number<0){
		System.out.println("number is negative");
		}
		else{
		System.out.println("number is zero");
		}
		}
		}
		
		