package pack4.builder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prog10 {
    public static void main(String[] args) {
// find average:
        List<Integer> list = List.of(9, 5, 6, 2, 1, 3, 10, 101, 4, 7, 56);

        Stream<List<Integer>> list1 = Stream.of(list);
        List<Stream<List<Integer>>> list2 = Arrays.asList(list1);
        Stream<Integer> stream = list.stream();

        // first need to convert from Wrapper to Primitive
        // using mapToObj we can convet to int
        // then get average() method

        double average =
                list.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0);

        System.out.println(average);
    }
}
