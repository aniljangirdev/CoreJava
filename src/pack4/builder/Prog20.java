package pack4.builder;

public class Prog20 {

    public static void main(String[] args) {
        Department department = new Department();
        department.setDeptName("NAME");

        String str = "TEsting";
        str = "test";
        print1(department);

        print2(str);

        System.out.println(str);

        System.out.println(department.toString());

    }

    private static void print2(String str) {
        str = "test1";
    }

    public static void print1(Department employee){
    employee.setDeptName("TEsting");
    }
}
