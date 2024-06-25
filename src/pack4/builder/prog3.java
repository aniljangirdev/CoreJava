package pack4.builder;

public class prog3 {
    public static void main(String[] args) {
        ConfigurationManager instanceManager = ConfigurationManager.getInstance();
        Object sample1 = instanceManager.getProperties()
                .get("sample1");

        System.out.println(sample1);

        Logger instanceLogger = Logger.getInstance();
        instanceLogger.log("hello");

        CacheManager instance = CacheManager.getInstance();

    }
}
