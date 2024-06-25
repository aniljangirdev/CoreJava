package pack4.builder;

import java.util.*;

public class PRog19 {
    public static void main(String[] args) {

        String name = null;
        try {
            name = "sample";
            name = null;
        } catch (Exception e) {
        }

        List<Integer> list = List.of(2, 62, 32, 412, 586, 12, 72, 7892, 564789);
        int[] array = list
                .stream()
                .map(Object::toString)
                .filter(s -> s.startsWith("5"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(array));

        List<Employee> employees = new ArrayList<>();
        Optional<Employee> collect = employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary));
    }
}
