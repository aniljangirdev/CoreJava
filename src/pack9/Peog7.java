package pack9;

import pack4.builder.Department;
import pack4.builder.Employee;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Peog7 {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Anil", 101, new BigDecimal(20000), 28);
        Employee employee1 = new Employee(2, "Prakash", 101, new BigDecimal(21000), 25);
        Employee employee2 = new Employee(3, "Sunit", 101, new BigDecimal(11000), 22);
        Employee employee3 = new Employee(4, "Ravi", 101, new BigDecimal(29000), 32);
        Employee employee4 = new Employee(5, "Mehul", 101, new BigDecimal(32000), 31);

        Department department = new Department();
        department.setDepId(1);
        department.setDeptName("IT");
        department.setEmployees(Set.of(employee,employee1));

        Department department1 = new Department();
        department1.setDepId(2);
        department1.setDeptName("Civil");
        department1.setEmployees(Set.of(employee2, employee3, employee4));

        List<Department> departments = new ArrayList<>(List.of(department,department1));

        // find all salary by department using flatMap
        long count = departments
                .stream()
                .map(Department::getEmployees)
                .flatMap(Collection::stream)
                .mapToInt(e -> e.getSalary().intValue())
                .sum();
        System.out.println(count);

        // get sum of salary by department please write code on java 8 sorted by salary desc


    }
}
