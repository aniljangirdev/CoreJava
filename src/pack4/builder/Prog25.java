package pack4.builder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Prog25 {
    public static void main(String[] args) {
        String string = CountingMinute();
        System.out.println(string);
    }

    private static String CountingMinute() {
        String time = "12:30pm-12:00am";
        String time1 = time.split("-")[0];
        String time2 = time.split("-")[1];
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm");
        LocalTime t1 = LocalTime.parse(time1, fmt);
        LocalTime t2 = LocalTime.parse(time2, fmt);
        long minutes = ChronoUnit.MINUTES.between(t1, t2); //80
        System.out.println(minutes);

        Map<String, Integer> students = new HashMap<>();
        students.put("Prakash",12);
        students.put("Anil",13);
        students.put("Anil",15);
        students.put("Pradeep",11);

        return null;
    }

}
