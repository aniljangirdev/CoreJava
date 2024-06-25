package pack4.builder;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Prog12 {
    public static void main(String[] args) {
        //find min and max from list
        List<Integer> list = List.of(9, 5, 6, 2, 1, 3, 10, 101, 4, 7, 56);
        IntSummaryStatistics intSummaryStatistics = list
                .stream()
                .mapToInt(value -> value)
                .summaryStatistics();

        int min = intSummaryStatistics.getMin();
        int max = intSummaryStatistics.getMax();

        System.out.println(min + " max " + max);
    }
}
