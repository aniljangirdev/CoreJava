package pack4.builder;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prog21 {

    public static void main(String[] args) {
        Employee employee = new Employee(
                1,
                "ANil",
                101,
                new BigDecimal("101"),
                30);

        // sort employee collection by age

        List<Employee> employee_test = List.of(employee);
        Map<Integer, List<Employee>> sortedEmployee = employee_test
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.groupingBy(Employee::getAge));


    }
}
