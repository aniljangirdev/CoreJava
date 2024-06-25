package pack4.builder;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Stream;

public class Prog22 {
    public static void main(String[] args) {
        Employee employee = new Employee(
                1,
                "Anil",
                101,
                new BigDecimal("111"),
                30
        );

        //find name of employee whoes have maximum salary
        Stream.of(employee)
                .max(Comparator.comparing(Employee::getSalary))
                .stream()
                .findFirst()
                .map(Employee::getEmpName)
                .orElse(null);

    }
}
