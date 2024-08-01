package pack6;

public class LiskovSubstitutionPrinciple {
}

abstract class Bird {
    public abstract void move();
}

class Ostrich extends Bird {

    @Override
    public void move() {

    }

    public void run(){
        // running
    }
}
