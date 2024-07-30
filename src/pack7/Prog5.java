package pack7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class Prog5 implements Shape {

    @Override
    public int getArea() {
        return Shape.super.getArea();
    }

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd" , Locale.TAIWAN);
        LocalDate localDate = LocalDate.of(1993, 1, 5);
        String format = localDate.format(dateTimeFormatter);



        System.out.println(format);

//        ZoneId zoneId = ZoneId.of("Asia/Dubai");
        LocalDateTime now = LocalDateTime.now();
        String format1 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(format1);

    }
}

interface Shape{
    default int getArea(){
        return 10;
    }

    String API = "test";

}
