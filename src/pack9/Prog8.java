package pack9;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class Prog8 {
    public static void main(String[] args) {
        // find date of last friday of each months
        findDay();

        // ???

        // find all index of all vowels
        Stream<String> stringStream = Stream.of("hello World");
        stringStream
                .flatMap(s -> Arrays.stream(s.split("")))
                .flatMapToInt(String::chars)
                .mapToObj(value -> (char) value)
                .forEach(System.out::println);
    }

    // find date of every friday of last week
    private static void findDay(){
        LocalDate now = LocalDate.now();
        int value = now.getDayOfWeek().getValue();
        String shortMonth = DateFormatSymbols.getInstance().getWeekdays()[value];
        System.out.println(shortMonth);
    }
}
