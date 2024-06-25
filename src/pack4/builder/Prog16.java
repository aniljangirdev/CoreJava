package pack4.builder;

import java.util.Arrays;
import java.util.function.Predicate;

public class Prog16 {
    public static void main(String[] args) {
        // square list of numbers
        // filter out grether then 100
        // find average of remaining number
        Integer[] integers = new Integer[]{5, 6, 4, 4, 7, 8, 12, 15};
        print(integers);
    }

    static void print(Integer[] integers) {
        double avg1 = Arrays.stream(integers)
                .map(val -> val * val)
                .filter(Predicate.not(value -> value < 100))
                .mapToInt(value -> value)
                .average()
                .orElse(0);

        System.out.println(avg1);

    }
}
