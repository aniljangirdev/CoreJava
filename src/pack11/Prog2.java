package pack11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Prog2 {
    public static void main(String[] args) {
      /*  hi i am java developer and i love java
        hi = 1
        i = 2
        am = 1
        java = 2*/
        String input = "hi i am java developer and i love java";
        System.out.println(findFirstRepeatedWord(input));

        System.out.println(findFirstRepeatedWord1(input));
    }

    private static String findFirstRepeatedWord(String input) {
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (Objects.equals(words[i], words[j])) {
                    return words[i];
                }
            }
        }
        return "N/A";
    }

    private static String findFirstRepeatedWord1(String input){
        String[] strings = input.split(" ");
        Map<String, Integer> integerMap = new HashMap<>();
        for (String val : strings) {
            integerMap.put(val, integerMap.getOrDefault(val, 0));
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : integerMap.entrySet()) {
            if(stringIntegerEntry.getValue() > 1){
                return stringIntegerEntry.getKey();
            }
        }

        return "";
    }
}
