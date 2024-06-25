package pack4.builder;

public class Prog1 {
    public static void main(String[] args) {
        Account account = Account
                .builder()
                .id(101)
                .username("Anil")
                .build();

        System.out.println(account);

        Student student = Student
                .builder()
                .name("Anil")
                .build();

        System.out.println(student);
    }
}
