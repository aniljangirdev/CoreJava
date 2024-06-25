package pack4.builder;

import java.util.Comparator;
import java.util.List;

public class Prog13 {
    public static void main(String[] args) {
        //Get2ndHighestAndLowest
        List<Integer> list = List.of(9, 5, 6, 2, 1, 3, 10, 101, 4, 7, 56);
        Integer secondLargest = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .orElse(-1);

        Integer secondSmallest = list
                .stream()
                .sorted()
                .limit(2)
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("secondLargest: " + secondLargest);
        System.out.println("secondSmallest: " + secondSmallest);
    }
}
