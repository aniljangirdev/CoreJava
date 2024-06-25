package pack4.builder;

import java.util.Arrays;

public class Prog28 {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5};

       var ints1  = Arrays.stream(ints)
                .map((i) -> i * 5)
                .toArray();

//        var ints1 = IntStream.of(ints)
//                .map((i) -> i * 5)
//                .toArray();

        System.out.println(Arrays.toString(ints1));

    }
}
