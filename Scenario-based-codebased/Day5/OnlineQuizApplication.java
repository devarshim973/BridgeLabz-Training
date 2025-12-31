//17. Online Quiz Application 🧠
//Ask 5 questions (MCQs) from a user.
//● Use arrays and for-loop.
//● Record score.
//● Switch for answer checking. Apply clear indentation and structured layout.

import java.util.*;

public class OnlineQuizApplication{
   public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
   
   String[] questions = {
            "1. What is the capital of India?\nA) Delhi\nB) Mumbai\nC) Chennai\nD) Kolkata",
            "2. Which language is used for Android development?\nA) Python\nB) Java\nC) C\nD) PHP",
            "3. How many days are there in a week?\nA) 5\nB) 6\nC) 7\nD) 8",
            "4. Which symbol is used for comments in Java?\nA) //\nB) ##\nC) **\nD) $$",
            "5. What is 2 + 2?\nA) 3\nB) 4\nC) 5\nD) 6"
        }; 
     
	 char[] answer= {'A', 'B', 'C', 'A', 'B'};
	 int scores=0;
	     for(int i=0;i<questions.length;i++){
	              System.out.println(questions[i]);
	              System.out.print("Enter your answer (A/B/C/D): ");
	                char useranswer= sc.next().toUpperCase().charAt(0);
	 
	  switch(useranswer){
	  case 'A':
	  case 'B':
	  case 'C':
	  case 'D':
	  if(useranswer==answer[i]){
	  System.out.println("correct :");
	  scores++;
	  }
	     else{
	  System.out.println("wrong :");
	     
	  }
	  break;
	  default:
	       System.out.println("invalid option");
	  
	  }
	  }
	        System.out.println("\n quiz completed");
	       System.out.println("your score"+ scores+ "out of" +questions.length);
	  }
	  }