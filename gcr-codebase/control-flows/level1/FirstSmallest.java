import java.util.*;

public class FirstSmallest{
    public static void main(String[] args){
	
	 //create scanner to take input
	 Scanner sc = new Scanner(System.in);
	 
	 //Initialize number1, number2, number3 user input 
	 System.out.print("enter number1");
	 int number1 = sc.nextInt();
	 System.out.print("enter number2");
	 int number2 = sc.nextInt();
	 System.out.print("enter number3");
	 int number3 = sc.nextInt();
	  
	  // check number2 and number3 is largest
	 if((number2>number1) &&( number3>number1)){
	 System.out.println(" Is the first number the smallest?yes");
	 }
	 else{
	 System.out.println(" Is the first number the smallest?No");
	 }
	 }
	 }
	 
	 

	 
	 
	 
	 
	 
	 