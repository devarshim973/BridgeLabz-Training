import java.util.*;

public class SumuntilzeroORnegative{
    public static void main(String[] args){
	
	 //create scanner class
	 Scanner sc = new Scanner(System.in);
	 
	 // Initialize total sum
        double total = 0.0;
		
		// Ask for input
        System.out.print("Enter a number : ");
        double number = sc.nextDouble();
		
		//check sum the value until number is zero or negative 
		while((number!=0)||(number>0)){
		total= total+number;
		System.out.println("again enter any number");
		number =sc.nextDouble();
		if((number==0) ||(number<0)){
		break;
		}
		}
		System.out.println(total);
		}
		}