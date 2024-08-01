package pack12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        //WAP to print MAX employee salary from collection
        getALlEmployees()
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent((employee ->
                        System.out.println(employee.getName())));

        //WAP to print MIN employee salary from collection
        getALlEmployees()
                .stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent((employee ->
                        System.out.println(employee.getName())));
        //WAP to print order by age employee salary from collection
        System.out.println("---------------- order by age-----------------");
        getALlEmployees()
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .forEach((employee ->
                        System.out.println(employee.getName())
                ));
        //WAP to print order by age employee salary from collection
        System.out.println("---------------- avarage salary-----------------");
        var average = getALlEmployees()
                .stream()
                .mapToDouble(Employee::getSalary)
                .average();
        System.out.println("Avg salary : " + average.toString());
        //WAP to print max salary of an employee from each department from collection
        System.out.println("---------------- salary of an employee from each department-----------------");
        getALlEmployees()
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))
                ))
                .entrySet()
                .forEach(System.out::println);
        //WAP to print and find out active/inactive employee from collection
        System.out.println("---------------- and find out active/inactive-----------------");
        getALlEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()))
//                .collect(Collectors.groupingBy(
//                        Employee::getActive,
//                        Collectors.counting()
//                ))
                .entrySet()
                .forEach(System.out::println);

    }


    public static List<Employee> getALlEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Anil");
        e1.setAge(29);
        e1.setActive("Active");
        e1.setDepartment("IT");
        e1.setYearOfjoining(2015);
        e1.setSalary(3000000);
        employees.add(e1);

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Prakash");
        e2.setAge(25);
        e2.setActive("InActive");
        e2.setDepartment("IT");
        e2.setYearOfjoining(2015);
        e2.setSalary(4000000);
        employees.add(e2);

        Employee e3 = new Employee();
        e3.setId(1);
        e3.setName("Yogesh");
        e3.setAge(39);
        e3.setActive("Active");
        e3.setDepartment("IT");
        e3.setYearOfjoining(2015);
        e3.setSalary(3500000);
        employees.add(e3);

        Employee e4 = new Employee();
        e4.setId(1);
        e4.setName("Ravi");
        e4.setAge(39);
        e4.setActive("Active");
        e4.setDepartment("Computer");
        e4.setYearOfjoining(2015);
        e4.setSalary(7000000);
        employees.add(e4);

        return employees;

    }
}


