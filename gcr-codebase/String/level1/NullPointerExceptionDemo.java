public class NullPointerExceptionDemo {

    //generate NullPointerException
    public static void generateException() {
        String text = null;   // initialized to null

        // line will generate NullPointerException
        System.out.println(text.length());
    }

    // handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;   

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Error Message: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {


        // Calling method that handles the exception
        handleException();
    }
}
