import java.util.Scanner;

public class SpringSeason{

      public static int SpringSeason(int month, int day){
	   
	   if((month==3 && day >=20) ||(month==4) || (month==5)|| (month==6 && day <=20)){
	     return 1;
	   }
		 return -1;
		 
		 }
		 
		 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		  
		int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		
		
		    SpringSeason ss = new SpringSeason();
			int springseason = ss.SpringSeason(month, day);
 
		  
		   if (springseason==1) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
		  
		 