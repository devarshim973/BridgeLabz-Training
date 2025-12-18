import java.util.*;

public class CounterForRocketLaunch{
    public static void main(String[] args){
	
	 //create scanner class
	 Scanner sc = new Scanner(System.in);
	 
	 //Initialize a counter
	  System.out.print("Enter a counter ");
        int counter = sc.nextInt();
		
		//check counter less then 1
		if(counter<=1){
			System.out.println("print correct value");
		}
		//
		for(int i=counter;i>=2;i--){
			counter--;
		System.out.println("updated counter value"+counter);
		}
		
		
		}
		}
		
		
		