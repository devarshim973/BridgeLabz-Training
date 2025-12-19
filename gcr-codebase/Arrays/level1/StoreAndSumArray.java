import java.util.Scanner;

public class StoreAndSumArray {
    public static void main(String[] args) {
   
       //create scanner to take input
        Scanner sc = new Scanner(System.in);
		 double arr[] = new double[10];
		 System.out.println("Enter a number : ");
            double number = sc.nextDouble();
			
		  double total = 0.0;                  
        int i = 0;
		
		while(i<10){
		arr[i]= sc.nextDouble();
	    System.out.println("Enter a number : ");
		if(arr[i]<0 ||arr[i]==0){
        break;
        }
		i++;
}
           
           for(int j=0;j<arr.length;j++){
      total= total+arr[j];
    }
   System.out.println("enter total value"+total);
}
}   