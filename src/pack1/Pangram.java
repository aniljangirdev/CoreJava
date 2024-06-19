package pack1;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String input = "TheQuickBrownFoxJumpsOverTheLazyDog";
        boolean pangram = isPangram(input);
        System.out.println("result: " + pangram);
    }

    static boolean isPangram(String input) {
        Set<Character> characters = new HashSet<>();
        String str = input.toLowerCase();

        for (char ch : str.toCharArray()) {
            characters.add(ch);
        }

        return characters.size() == 26;
    }
}