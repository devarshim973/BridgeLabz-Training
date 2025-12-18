import java.util.*;

public class RocketLaunch{
    public static void main(String[] args){
	
	 //create scanner class
	 Scanner sc = new Scanner(System.in);
	 
	 //Initialize a counter
	  System.out.print("Enter a counter ");
        int counter = sc.nextInt();
		//check counter less 1 or equal
		if(counter<=1){
		System.out.println("enter correct counter value");
		}
		while(counter!=1){
		counter--;
		System.out.println("updated counter value"+counter);
		}
		}
		}
		
		