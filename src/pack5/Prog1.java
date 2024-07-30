package pack5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Prog1 {
    public static void main(String[] args) {
        // WAP to find Repeated character of Array
        String input = "This is example of java";

        Character[] array = input
                .chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toArray(Character[]::new);
        System.out.println(Arrays.toString(array));

        // WAP to find unique character from below array
        int[] arr = {1, 2, 1, 2, 3};
        Set<Integer> data = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int i : arr) {
            res.add(i);
        }
        Set<Integer> collect = res
                .stream()
                .filter(integer -> !data.add(integer)).collect(Collectors.toSet());
        List<Integer> finalResult = new ArrayList<>();
        for (Integer re : res) {
            if (!collect.contains(re)) {
                finalResult.add(re);
            }
        }
        System.out.println(finalResult);

        // which data structure use to avoid duplicates and handle insertion order?
        // to avoid duplication -> Set
        // to handle insertion order -> LinkedHashSet
    }
}
