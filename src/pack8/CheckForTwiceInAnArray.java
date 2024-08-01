package pack8;

import pack4.builder.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckForTwiceInAnArray {
    public static void main(String[] args) {
        // Given an integer array arr, return true if any value appears at least twice in the array, and
        // return false if every element is distinct.

        int[] arr = {5, 6, 2, 10, 0, 1, 9, 0, 52};

        boolean b = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(integerLongEntry -> integerLongEntry.getValue() == 2);

        System.out.println(b);

        String s = "string data to count each character";
        s.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String input = "Java articles are Awesome";
        input
                .chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('0');

        char[] c = new char[]{'a', 'c', 'c', 'd'};
        Arrays.toString(c)
                .chars()
                .mapToObj((val) -> (char) val)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        List<Character> c1 = Stream.of('a', 'b', 'b', 'c')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(c1);

        String input2 = "Anil, Ravi, Mohan, Anil";

        String[] split = input2.split(",");
        LinkedHashMap<String, Long> collect = Arrays.stream(split)
                .map(String::trim)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (o1, o2) -> o1, LinkedHashMap::new));

        System.out.println(collect);

        IntStream
                .rangeClosed(0, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);

        String str2 = "This is example of is example";
        String[] strArray = str2.split(" ");
        List<String> list = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);


    }
}
