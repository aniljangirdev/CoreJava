package pack4.builder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog7 {
    public static void main(String[] args) {
        // checkANumberisTwiceInArray
        int[] arr = {5, 6, 2, 10, 1, 9, 0, 52};
        boolean numberIsTwiceInArray = isNumberIsTwiceInArray(arr);
        System.out.println(numberIsTwiceInArray);

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        Stream<String> concat = Stream.concat(list1.stream(), list2.stream());
        System.out.println(concat);
    }

    private static boolean isNumberIsTwiceInArray(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(integerLongEntry -> integerLongEntry.getValue() > 2);
    }
}
