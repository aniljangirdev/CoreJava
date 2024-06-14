package pack1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInArray {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        List<Integer> collect = listOfIntegers
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();


        System.out.println(collect);


    }
}
