package pack13;

public class Prog2 {
    public static void main(String[] args) {
        C c = new C();
        c.hello();

    }
}

abstract class D implements A {
    public abstract void hello();
}

class C extends D implements A, B {

    @Override
    public void hello() {
       B.super.hello();
    }
}

interface A {
    default void hello() {
        System.out.println("Hello A!");
    }
}

interface B extends A {
    default void hello() {
        System.out.println("Hello B!");
    }
}


