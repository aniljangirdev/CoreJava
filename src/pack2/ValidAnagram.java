package pack2;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent ";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }

    private static boolean isAnagram(String s, String t){
        if(s == null || t== null || s.length() != t.length()) return false;

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
