import java.util.*;

public class SpringSeason{
    public static void main(String[] args){
	
	 //create scanner to take input
	 Scanner sc = new Scanner(System.in);
	 
	 // Take month and day input from user
	  System.out.print("Enter a month ");
        int month = sc.nextInt();
		
	  System.out.print("Enter a day  ");
        int day = sc.nextInt();
		
		// Check if the date is in Spring Season
	if( (month == 3 && day >= 20) ||(month == 4) ||(month == 5) ||(month == 6 && day <= 20)){
		System.out.println("Its a Spring Season");
		}
		else{
		System.out.println("Not a Spring Season");
		}
		}
		}
		
		