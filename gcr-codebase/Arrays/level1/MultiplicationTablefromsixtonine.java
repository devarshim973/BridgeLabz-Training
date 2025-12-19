import java.util.Scanner;

//a program to print a multiplication table of a number.

public class MultiplicationTablefromsixtonine {
    public static void main(String[] args) {
       
	    //create scanner to take input
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        int table[] = new int[11];
		for(int i=6;i<=9;i++){
		table[i-6]=number*i;
		System.out.println(number + " * " + i + " = " + table[i-6]);
		}
		}
}
		     