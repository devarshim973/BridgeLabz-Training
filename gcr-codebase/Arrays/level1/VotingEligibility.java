import java.util.Scanner;

//a take user input for the age of all 10 students in a class and check whether the 
//student can vote depending on his/her age is greater or equal to 18.


public class VotingEligibility {
    public static void main(String[] args) {
            
	  //create scanner class
        Scanner sc = new Scanner(System.in);
		int[] age = new int[10];

      //Take user input for ages
        for(int i=0;i<age.length;i++){
		System.out.print("Enter the student age: ");
         age[i] = sc.nextInt();
		}
		//Loop through array and check voting eligibility
		for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Invalid age: " + age[i]);
            } 
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            } 
            else {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            }
        }
		}
		}