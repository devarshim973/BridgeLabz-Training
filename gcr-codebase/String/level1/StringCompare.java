import java.util.*;

public class StringCompare{

      //compare two strings using charAt()
       public static boolean compareusingCharAt(String s1, String s2){
	         
			 if(s1.length()!= s2.length()){
			 return false;
			 }
			 
			 
			 for(int i=0; i<s1.length();i++){
			 if(s1.charAt(i)!=s2.charAt(i)){
			 return false;
			 }
			 }
			 return true;
			 }
			 
			 public static void main (String[] args){
			   
			   Scanner sc = new Scanner(System.in);
			   
			   //take input from user
			  System.out.print("enter frist string:");
                String s1 = sc.next();
				 System.out.print("enter second string:");
                String s2 = sc.next();
				
				// Compare using charAt method
			boolean charAtResult= compareusingCharAt(s1, s2);
			
			// Compare using equals() method
			boolean equalsResult= s1.equals(s2);
			
			System.out.println("result using charAt() method:" +charAtResult);
			System.out.println("result using equals() method:" +equalsResult);
			
			  // Check if both results are same
        if (charAtResult == equalsResult) {
            System.out.println("Both comparison results are SAME");
        } else {
            System.out.println("Comparison results are DIFFERENT");
        }
			
		}
}		
			
             				
			  