package pack9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Proog2 {
    public static void main(String[] args) {
        String str = "there is three and three leaves green are green";

        String[] strArray = str.split(" ");

        List<String> list = Stream.of(strArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);

    }
}
