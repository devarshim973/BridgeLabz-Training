 
 //a program to count the number of vowels and consonants in a given string.
 import java.util.*;
 public class CountVowelAndConsonants{
       public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string");
		String text = sc.nextLine();
		
		int vowels =0;
		int consonants =0;
		
		for(int i=0;i<text.length();i++){
		 char ch = text.charAt(i);
		 
		// check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
                vowels++;
            }
           else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}			
 
 