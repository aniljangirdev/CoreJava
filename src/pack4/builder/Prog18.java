package pack4.builder;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog18 {
    public static void main(String[] args) {
        List<Integer> list = List.of(6, 6, 23, 32, 23, 12, 236, 65, 12, 456, 654, 7789, 456);
        List<Integer> list1 = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list1);
    }
}
