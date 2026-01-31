package com.LambdaExpressions.NotificationFiltering;

public class Alert {

    private String type;      // EMERGENCY, APPOINTMENT, PROMOTION
    private String message;
    private int priority;     // 1 = High, 2 = Medium, 3 = Low

    public Alert(String type, String message, int priority) {
        this.type = type;
        this.message = message;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "type='" + type + '\'' +
                ", priority=" + priority +
                ", message='" + message + '\'' +
                '}';
    }
}
