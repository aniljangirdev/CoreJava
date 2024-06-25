package pack4.builder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {

    private static ConfigurationManager instance;
    private final Properties properties;
    private final ThreadLocal<Integer> integerThreadLocal;

    private ConfigurationManager() {
        properties = new Properties();

        integerThreadLocal = ThreadLocal.withInitial(() -> 1);
        try (FileInputStream fileInputStream = new FileInputStream("src/resource.properties")) {
            this.properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public Properties getProperties() {
        return properties;
    }
}
