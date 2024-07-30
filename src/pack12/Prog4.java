package pack12;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Prog4 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        ZonedDateTime d = ZonedDateTime.parse("16/08/2023");
        var format = d.format(dateTimeFormatter);
        System.out.println(format);
    }
}
