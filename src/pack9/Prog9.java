package pack9;

import pack4.builder.Employee;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prog9 {
    public static void main(String[] args) {
        // -empList -> find -the highest salaried employees from male and female?
        Employee employee1 = new Employee(1, "Anil", 101, new BigDecimal(20000), 28, "male");
        Employee employee2 = new Employee(2, "Prakash", 102, new BigDecimal(25000), 28, "female");
        Employee employee3 = new Employee(3, "Ravi", 101, new BigDecimal(15000), 28, "male");

        // find all employee by employee name
        List<Employee> employees = List.of(employee1, employee2, employee3);

        Map<String, List<Employee>> collect = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender));

        System.out.println(collect.size());
    }
}
