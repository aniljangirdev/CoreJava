package pack12;

public class Employee {
   int id;
   String name;
   int age;
   String active;
   String department;
   int yearOfjoining;
   double salary;

   @Override
   public String toString() {
      return this.id + " " + this.salary;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getActive() {
      return active;
   }

   public void setActive(String active) {
      this.active = active;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
   }

   public int getYearOfjoining() {
      return yearOfjoining;
   }

   public void setYearOfjoining(int yearOfjoining) {
      this.yearOfjoining = yearOfjoining;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }
}
