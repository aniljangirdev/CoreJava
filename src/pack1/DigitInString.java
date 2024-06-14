package pack1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DigitInString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("test1", "1", "3", "40af", "ss", "505");

        List<String> collect = list
                .stream()
                .filter(s -> Character.isDigit(s.charAt(0)))
                .toList();

        System.out.println(collect);

    }
}
