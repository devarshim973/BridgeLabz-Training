import java.util.*;

 public class TemperatureLogger{
   public static void main(String[] args){
   
     Scanner sc = new Scanner(System.in);
	  
	  double[] temp = new double[7];
	  double sum=0;
	  double max;
	   
	   //input temperature
	   for(int i=0;i<7;i++){
	   System.out.print("enter temperature of day" +(i+1));
	   temp[i] =sc.nextDouble();
	   }
	   max=temp[0];
	   //calculate sum and temperature
	   for(int i=0;i<7;i++){
	   sum=sum+temp[i];
	   
	   if(temp[i]>max){
	   max=temp[i];
	   }
	   }
	   
	   double average = sum/7;
	   
	   //result
	   System.out.println("average temperature"+average);
	   System.out.println("maximum temperature"+max);
	   }
	   }
	   