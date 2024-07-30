package pack7;

import java.util.HashSet;

public class Prog4 {
    public static void main(String[] args) {
        String str = " ";
        int i = lengthOfLongestSubstring(str);
        System.out.println(i);
    }

    private static int lengthOfLongestSubstring(String str) {
        int count = 0;

        char[] charArray = str.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (char c : charArray) {
            if (!characters.contains(c)) {
                characters.add(c);
            } else {
                break;
            }
            count = Math.max(count, characters.size());
        }
        return count;
    }
}
