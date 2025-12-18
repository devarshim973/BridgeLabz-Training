import java.util.*;

public class SumOfNaturalNumbersusingfor {
    public static void main(String[] args) {

        // Create Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		 int total =0;
		 if(number > 0){
		    int sum_of_natural = number * (number+1)/2;
			for(int i=number;i>=1;i--){
			    total += i;
				
			}
			
			if(sum_of_natural == total){
			    System.out.println("The sum of natural number is "+total);
			}
		}else{
		    System.out.println("This is not the a natural number please enter correct!");
		}
	}
}
       