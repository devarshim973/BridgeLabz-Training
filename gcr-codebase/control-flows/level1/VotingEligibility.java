import java.util.*;

public class VotingEligibility{
    public static void main(String[] args){
	
	 //create scanner to take input
	 Scanner sc = new Scanner(System.in);
	 
	  // Take age input from user
	  System.out.print("Enter age ");
        int age = sc.nextInt();
		
		// Check voting eligibility
		if(age>=18){
		System.out.println("The person's age is greater or equal to 18 then can vote");
		}
		else{
		System.out.println("The person's age is less then 18 cannot vote");
		}
		}
		}
		
		