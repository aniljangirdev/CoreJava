package pack3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Prog6 {
    public static void main(String[] args) {
        //WAP to print MAX employee salary from collection
        getALlEmployees()
                .stream()
                .max(Comparator.comparingDouble(EmployeeT::getSalary))
                .ifPresent((employee ->
                        System.out.println(employee.getName())));

        //WAP to print MIN employee salary from collection
        getALlEmployees()
                .stream()
                .min(Comparator.comparingDouble(EmployeeT::getSalary))
                .ifPresent((employee ->
                        System.out.println(employee.getName())));
        //WAP to print order by age employee salary from collection
        System.out.println("---------------- order by age-----------------");
        getALlEmployees()
                .stream()
                .sorted(Comparator.comparingInt(EmployeeT::getAge))
                .forEach((employee ->
                        System.out.println(employee.getName())
                ));
        //WAP to print order by age employee salary from collection
        System.out.println("---------------- avarage salary-----------------");
        var average = getALlEmployees()
                .stream()
                .mapToDouble(EmployeeT::getSalary)
                .average();
        System.out.println("Avg salary : " + average.toString());
        //WAP to print max salary of an employee from each department from collection
        System.out.println("---------------- salary of an employee from each department-----------------");
        getALlEmployees()
                .stream()
                .collect(Collectors.groupingBy(
                        EmployeeT::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(EmployeeT::getSalary)))
                ))
                .entrySet()
                .forEach(System.out::println);
        //WAP to print and find out active/inactive employee from collection
        System.out.println("---------------- and find out active/inactive-----------------");
        getALlEmployees()
                .stream()
                .collect(Collectors.groupingBy(EmployeeT::getDepartment,
                        Collectors.counting()))
//                .collect(Collectors.groupingBy(
//                        Employee::getActive,
//                        Collectors.counting()
//                ))
                .entrySet()
                .forEach(System.out::println);

    }


    public static List<EmployeeT> getALlEmployees() {
        List<EmployeeT> employees = new ArrayList<>();
        EmployeeT e1 = new EmployeeT();
        e1.setId(1);
        e1.setName("Anil");
        e1.setAge(29);
        e1.setActive("Active");
        e1.setDepartment("IT");
        e1.setYearOfjoining(2015);
        e1.setSalary(3000000);
        employees.add(e1);

        EmployeeT e2 = new EmployeeT();
        e2.setId(1);
        e2.setName("Prakash");
        e2.setAge(25);
        e2.setActive("InActive");
        e2.setDepartment("IT");
        e2.setYearOfjoining(2015);
        e2.setSalary(4000000);
        employees.add(e2);

        EmployeeT e3 = new EmployeeT();
        e3.setId(1);
        e3.setName("Yogesh");
        e3.setAge(39);
        e3.setActive("Active");
        e3.setDepartment("IT");
        e3.setYearOfjoining(2015);
        e3.setSalary(3500000);
        employees.add(e3);

        EmployeeT e4 = new EmployeeT();
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


