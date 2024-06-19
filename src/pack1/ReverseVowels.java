package pack1;

public class ReverseVowels {
    public static void main(String[] args) {
        String input = "hello world";
        String output = reverseVowels(input);
        System.out.println(output);
    }

    private static String reverseVowels(String input) {
        int j = 0;
        char[] chars = input.toCharArray();
        StringBuilder vowels = new StringBuilder();
        for (char ch : chars) {
            if (isVowel(ch)) {
                j++;
                vowels.append(ch);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = vowels.charAt(--j);
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
}