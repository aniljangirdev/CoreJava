package pack9;

import pack4.builder.Employee;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Prog5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Anil", 101, new BigDecimal(20000), 28);
        Employee employee2 = new Employee(2, "Prakash", 102, new BigDecimal(25000), 28);
        Employee employee3 = new Employee(3, "Ravi", 101, new BigDecimal(15000), 28);

        // find all employee by employee name
        List<Employee> employees = List.of(employee1, employee2, employee3);
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getEmpName));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, employee1);
        employeeMap.put(2, employee2);
        employeeMap.put(3, employee3);

        employeeMap
                .values()
                .stream()
                .sorted(Comparator.comparing(Employee::getEmpName))
                .toList();
    }
}
