package pack4.builder;


import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparator<Employee> {

    private final Integer empId;
    private final String empName;
    private final int departmentId;
    private final BigDecimal salary;
    private final Integer age;

    public Employee(Integer empId, String empName, int departmentId, BigDecimal salary, Integer age) {
        this.empId = empId;
        this.empName = empName;
        this.departmentId = departmentId;
        this.salary = salary;
        this.age = age;

    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpId() - o2.getEmpId();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(empId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
            return false;

        Employee employee = (Employee) obj;
        return Objects.equals(employee.empId, this.empId);
    }
}
