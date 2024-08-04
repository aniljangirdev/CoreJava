package Utils;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DateTimeUtil {
    private static Instant start;

    public static void startTime() {
        start = Instant.now();
    }

    public static void endTime() {
        Instant end = Instant.now();
        Duration between = Duration.between(start, end);
        System.out.println("Elapased: " + between.toMillis());
    }

}
