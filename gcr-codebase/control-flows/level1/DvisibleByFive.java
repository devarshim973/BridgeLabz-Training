import java.util.*;

public class DvisibleByFive{
    public static void main(String[] args){
	
	 //create scanner to take input
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("enter number");
	 int number = sc.nextInt();
	 
	 if(number % 5==0){
	 System.out.println("Is the number " + number + " divisible by 5? Yes");
	 }
	 else{
	 System.out.println("Is the number " + number + " divisible by 5? No");
	 }
	 }
	 }
	 