package pack1;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4};
        Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(integerLongEntry -> integerLongEntry.getValue() > 1);
    }
}
