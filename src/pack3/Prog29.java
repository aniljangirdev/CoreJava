package pack3;

public class Prog29 {
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
