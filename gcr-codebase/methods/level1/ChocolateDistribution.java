import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] RemainderAndQuotientChocolates(int numberOfChocolates, int numberOfChildren) {

       // quotient and remainder
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; 
        int remainingChocolates = numberOfChocolates % numberOfChildren; 

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calling the method
        int[] result =RemainderAndQuotientChocolates(numberOfChocolates, numberOfChildren);

        System.out.println("Each child will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are " + result[1]);

    }
}
