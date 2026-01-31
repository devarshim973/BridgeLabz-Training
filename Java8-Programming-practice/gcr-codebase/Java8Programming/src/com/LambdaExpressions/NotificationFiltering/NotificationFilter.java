package LambdaExpressions.NotificationFiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFilter {

    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("EMERGENCY", "Heart rate critical", 1));
        alerts.add(new Alert("APPOINTMENT", "Doctor visit tomorrow", 2));
        alerts.add(new Alert("PROMOTION", "Health checkup discount", 3));
        alerts.add(new Alert("EMERGENCY", "Blood pressure high", 1));

        // 🔸 User wants only EMERGENCY alerts
        Predicate<Alert> emergencyOnly =
                alert -> alert.getType().equals("EMERGENCY");

        // 🔸 User wants high priority alerts
        Predicate<Alert> highPriority =
                alert -> alert.getPriority() == 1;

        // 🔸 Combine conditions (Emergency AND High Priority)
        Predicate<Alert> emergencyAndHigh =
                emergencyOnly.and(highPriority);

        List<Alert> filteredAlerts = alerts.stream()
                .filter(emergencyAndHigh)
                .collect(Collectors.toList());

        System.out.println("Filtered Alerts:");
        filteredAlerts.forEach(System.out::println);
    }
}
