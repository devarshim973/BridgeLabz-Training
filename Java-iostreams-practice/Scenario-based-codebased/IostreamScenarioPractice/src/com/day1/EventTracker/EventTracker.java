package src.com.day1.EventTracker;

pimport com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class EventTracker {

    public static void main(String[] args) {
        try {
            Class<?>[] classesToScan = {UserActions.class}; // Add all classes here
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode auditLogs = mapper.createArrayNode();

            for (Class<?> cls : classesToScan) {
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(AuditTrail.class)) {
                        AuditTrail audit = method.getAnnotation(AuditTrail.class);
                        ObjectNode logEntry = mapper.createObjectNode();
                        logEntry.put("Class", cls.getSimpleName());
                        logEntry.put("Method", method.getName());
                        logEntry.put("Action", audit.action());
                        logEntry.put("Timestamp", LocalDateTime.now().toString());
                        auditLogs.add(logEntry);
                    }
                }
            }

            // Write JSON audit log to file
            mapper.writerWithDefaultPrettyPrinter().writeValue(
                    new java.io.File("audit-log.json"), auditLogs
            );

            System.out.println("Audit log generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
