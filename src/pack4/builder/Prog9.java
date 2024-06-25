package pack4.builder;

import java.util.List;
import java.util.stream.Collectors;

public class Prog9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 84, 7, 4, 1, 2, 5, 10, 3, 36, 12, 11, 20, 56);
        CountEventAndOdd(list);
    }

    private static void CountEventAndOdd(List<Integer> list) {
        list
                .stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
