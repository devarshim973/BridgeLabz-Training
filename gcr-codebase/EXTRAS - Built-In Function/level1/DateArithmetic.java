import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User date input  (yyyy-mm-dd format)
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        // 7 days, 1 month, 2 years add karna
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // 3 weeks subtract 
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Results display
        System.out.println("Original Date : " + date);
        System.out.println("After Additions (7 days, 1 month, 2 years): " + updatedDate);
        System.out.println("After Subtracting 3 weeks: " + finalDate);
    }
}
