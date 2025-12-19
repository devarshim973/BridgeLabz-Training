import java.util.Scanner;

//a program to print a multiplication table of a number.

public class MultiplicationTable {
    public static void main(String[] args) {
       
	    //create scanner to take input
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        int table[] = new int[11];
		for(int i=1;i<=table.length;i++){
		table[i]=number*i;
		System.out.println(number + " * " + i + " = " + table[i]);
		}
		}
		}
		     