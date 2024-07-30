package pack5;

public class SingletonPattern {
    public static void main(String[] args) {
        Logger.getInstance().log("test");
    }
}

class Logger {
    private static volatile Logger instance;

    private Logger() {

    }

    public static  Logger getInstance() {
            synchronized (Logger.class){
                if (instance == null) {
                    instance = new Logger();
                }
                return instance;
        }
    }

    public void log(String message) {
        System.out.println(message);
    }
}
