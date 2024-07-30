package pack11;

public class Prog6 {
    public static void main(String[] args) {
        A a =new B();
//        a.print(); // compile time error
    }
}

class A {
}

class B extends A {
    public void print() {
    }
}
