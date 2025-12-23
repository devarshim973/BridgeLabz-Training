import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {

    public static void main(String[] args) {

        // GMT Time
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current GMT Time: " + gmtTime);

        // IST Time (India)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current IST Time: " + istTime);

        // PST Time (America)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current PST Time: " + pstTime);
    }
}
