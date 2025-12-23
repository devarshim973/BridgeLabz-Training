import java.util.*;

 public class ToggleCase{
    
	public static String toggleCase(String text){
	   String result = "";
	   
	   for(int i=0;i<text.length();i++){
	   char ch = text.charAt(i);
	   
	   // Uppercase to Lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            // Lowercase to Uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            // Other characters
            else {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
		//create scanner take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggled = toggleCase(input);

        System.out.println("Toggled String: " + toggled);
    }
}