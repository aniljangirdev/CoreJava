package pack4.builder;

import java.util.Set;

public class Department {

    private Integer depId;
    private String deptName;
    private Set<Employee> employees;

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Integer getDepId() {
        return depId;
    }

    public String getDeptName() {
        return deptName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", deptName='" + deptName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
