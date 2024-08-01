package pack4.builder;

import java.util.Arrays;
import java.util.Comparator;

public class Prog29 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 5, 9, 8};
        int secondLast = getSecondLast(arr);
        System.out.println(secondLast);
    }

    private static int getSecondLast(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(value -> value)
                .skip(1)
                .findFirst()
                .orElse(-1);
    }
}
