package pack4.builder;

import java.util.List;
import java.util.stream.IntStream;

public class Prog17 {
    public static void main(String[] args) {
        //IgnoreLast5NosAndFindSum
        List<Integer> list = List.of(9, 5, 6, 2, 1, 3, 10, 101, 4, 7, 56);
        int sum = ignoreLast5NosAndFindSum(list);
        System.out.println(sum);
    }

    static int ignoreLast5NosAndFindSum(List<Integer> list) {
        return IntStream.rangeClosed(1, list.size())
                .mapToObj(i -> list.get(list.size() - i))
                .skip(5)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
