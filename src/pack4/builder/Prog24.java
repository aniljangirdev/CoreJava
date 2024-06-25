package pack4.builder;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Prog24 {
    public static void main(String[] args) {
        String PATTERN = "dd/MM/yyyy";
        String INPUT = "16/08/2023";


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(PATTERN);
        ZonedDateTime d = ZonedDateTime.now();
        var format = d.format(dateTimeFormatter);
        System.out.println(format);


        LocalDate localDate = LocalDate.now();
        String formattedString = localDate.format(dateTimeFormatter);
        System.out.println(formattedString);
    }
}
