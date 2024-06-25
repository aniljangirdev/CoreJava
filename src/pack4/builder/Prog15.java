package pack4.builder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Prog15 {
    public static void main(String[] args) {
        // pattern
        String PATTERN = "^([0-9]{10}|[0-9]{13})$";
        boolean matches = Pattern.matches(PATTERN, "1234567890118");
        System.out.println(matches);

        //example1
        try (ResourceType resourceType = new ResourceType()) {
            // do operation
        } catch (Exception ignored) {
        }

        // example2
        try (
                FileReader fileReader = new FileReader("./src/resource.properties");
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            bufferedReader.lines()
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
