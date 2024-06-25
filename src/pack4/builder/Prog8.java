package pack4.builder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog8 {
    public static void main(String[] args) {
        //CountCharacter
        String input = "string data to count each character";
        LinkedHashMap<Character, Long> characterLongLinkedHashMap = CountCharacter(input);
        System.out.println(characterLongLinkedHashMap);
    }

    private static LinkedHashMap<Character, Long> CountCharacter(String input) {
        return input
                .chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new));
    }
}
