package pack8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class AgeDiff {
    public static void main(String[] args) {
        LocalDate dobDate = LocalDate.of(1993, Month.JANUARY, 5);
        LocalDate now = LocalDate.now();

        Period between = Period.between(dobDate, now);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};

        int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .toArray();
//        System.out.println(Arrays.toString(array));

        findSumOfTwoArray1(arr1, arr2);

    }

    static void findSumOfTwoArray1(int[] arr1, int[] arr2) {
        List<Integer> list1 = Arrays.stream(arr1)
                .boxed()
                .toList();

        List<Integer> list2 = Arrays.stream(arr2)
                .boxed()
                .toList();

    }


    static void findSumOfTwoArray(int[] arr1, int[] arr2) {

        int[] array = IntStream.range(0, arr1.length)
                .map(i -> arr1[i] + arr2[i])
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}

