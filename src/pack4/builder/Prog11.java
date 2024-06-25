package pack4.builder;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog11 {
    public static void main(String[] args) {
        String input = "JAVE TESA";
        Character result = findFirstNonRepeatedCharacter(input);
        System.out.println(result.charValue());
    }

    private static Character findFirstNonRepeatedCharacter(String input) {
        // first need to convert to character array
        // put in to map with key and value as count of each character
        // to find character use filter if value > 1
        // return that characters

        return input.chars()
                .mapToObj(value -> Character.toUpperCase((char) value))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);


    }
}
