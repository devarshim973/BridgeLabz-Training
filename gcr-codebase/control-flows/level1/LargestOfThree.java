import java.util.*;

public class LargestOfThree{
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
	 
	 //check number is largest 
	 if((number1>number2) && (number1>number3)){
	 System.out.println("Is the first number the largest? Yes");
     System.out.println("Is the second number the largest? no");
	 System.out.println("Is the third number the largest? no");
	 }
	 else if((number2>number1) &&(number2>number3)){
	 System.out.println("Is the first number the largest? no");
	 System.out.println("Is the second number the largest? Yes");
	 System.out.println("Is the third number the largest? no");
	 }
	 else{
	 System.out.println("Is the first number the largest? no");
	 System.out.println("Is the second number the largest? no");
	 System.out.println("Is the third number the largest? Yes");
	 }
	 }
	 }