package pack3;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pract2 {
    public static void main(String[] args) {
        String str = "hhhHheeeeelllloowooorwld".toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if ((i != j) && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(str.charAt(i));
                break;
            }
        }
        char firstRepeat = findFirstRepeat(str);
        System.out.println(firstRepeat);
    }

    static char findFirstRepeat(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('0');
    }
}


