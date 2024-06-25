package pack4.builder;

import java.util.Set;

public class Department {

    private ClassLoader classLoader;
    private Integer depId;
    private String deptName;
    private Set<Employee> employees;

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
