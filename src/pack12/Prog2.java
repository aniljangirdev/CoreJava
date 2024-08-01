package pack12;

import java.util.ArrayList;
import java.util.List;

public class Prog2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId(1);
        employee.setDepartment("IT");
        employee.setSalary(10000);


        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setDepartment("IT");
        employee1.setSalary(20000);

        list.add(employee);
        list.add(employee1);

        list
                .stream()
                .filter((emp -> emp.getSalary() < 20000))
                .map((emp -> {
                    double incrementAmount = (emp.getSalary() * 10) / 100;
                    emp.setSalary(emp.getSalary() + incrementAmount);
                    return emp;

                }))
                .forEach((emp)->{
                    System.out.println(emp.getSalary());
                });


    }
}
