package LambdaExpressions.InvoiceObjectCreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<Integer> transactionIds =
                Arrays.asList(1001, 1002, 1003, 1004);

        // Constructor reference
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
