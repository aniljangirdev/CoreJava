package pack4.builder;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){
        
    }

    static synchronized Singleton getInstance(){
        return instance;
    }

    public void doStuff(){

    }

}
