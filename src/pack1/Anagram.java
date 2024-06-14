package pack1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Hellow";
        String s2 = "Hellow";

        boolean anagram = isAnagram1(s1, s2);
        System.out.println(anagram);


    }

    private static boolean isAnagram1(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] array1 = s1.chars()
                .map(Character::toUpperCase)
                .sorted()
                .toArray();

        int[] array2 = s2.chars()
                .map(Character::toUpperCase)
                .sorted()
                .toArray();

        return Arrays.equals(array1, array2);
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        return Arrays.equals(s1.toCharArray(), s2.toCharArray());
    }
}
