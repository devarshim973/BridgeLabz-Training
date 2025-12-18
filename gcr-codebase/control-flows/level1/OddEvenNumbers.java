import java.util.*;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		for(int i=1;i<=number;i++){
		if(i%2==0){
		System.out.println("the number"+i+" is even");
		}
		else{
		System.out.println("the number "+i+"is odd");
		}
		}
		}
}