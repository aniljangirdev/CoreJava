package pack6;

public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {

    }
}

//A client should not be forced to implement an interface it doesn't use

interface Workable{
    void work();
}

interface Eater{
    void eat();
}

class Human implements Workable, Eater {

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}

class Robot implements Workable {

    @Override
    public void work() {

    }
}