package pack13;

import java.util.List;
import java.util.stream.Collectors;

public class Prog3 {
    public static void main(String[] args) {
        //find out all the numbers starting with 1 using Stream functions

        List<Integer> integerList = List.of(10, 5, 3, 12, 20, 7);

        integerList.stream()
                .map(String::valueOf)
                .filter((str)->str.startsWith("1"))
                .collect(Collectors.toList());
    }
}
