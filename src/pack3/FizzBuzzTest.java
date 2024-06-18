package pack3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzTest {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 50)
                .mapToObj(value -> {
                    if (value % (3 * 5) == 0) {
                        return "FizzBuzz";
                    } else if (value % 3 == 0) {
                        return "Fizz";
                    } else if (value % 5 == 0) {
                        return "Buzz";
                    } else {
                        return "" + value;
                    }
                })
                .forEach(System.out::println);
    }
}
