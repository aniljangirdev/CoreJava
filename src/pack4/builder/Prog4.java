package pack4.builder;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog4 {
    public static void main(String[] args) {
        // join query 1
        /*
         * Department dept_id, dept_name;
         * Employee emp_id, emp_name, dept_id;
         * */
        /*
            SELECT D_ID, D_NAME, E.NAME FROM DEPARTMENT D INNER JOIN EMPLOYEE E ON D.ID = E.ID;
         */

        int[] array = {10, 5, 20, 8, 15};
        int second = findSecondLargest(array);
        System.out.println(second);
    }

    private static int findSecondLargest(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

    }

    public static int findSecondLargest(Integer[] array) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Integer i : array) {
            integerMap.put(i, integerMap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : integerMap.entrySet()) {
            if (integerIntegerEntry.getValue() > 1) {
                return integerIntegerEntry.getKey();
            }
        }
        return 0;
    }

    public static List<Integer> findRepeatedElement1(int[] arr) {
        return null;
    }

    public static List<Integer> findRepeatedElement(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static char mostCharacter(String str) {
        return str.chars()
                .mapToObj((c) -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse((char) 0);
    }


}
