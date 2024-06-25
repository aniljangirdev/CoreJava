package pack4.builder;

public class Student {

    private String username;

    public static Builder builder() {
        return new Student().new Builder();
    }

    class Builder {

        public Student build() {
            return Student.this;
        }

        public Builder name(String username) {
            Student.this.username = username;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                '}';
    }
}
