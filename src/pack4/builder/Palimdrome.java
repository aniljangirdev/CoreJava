package pack4.builder;

public class Palimdrome {
    public static void main(String[] args) {
        // palimdrome
        // eg: "abcba"

        // two pointer technique

        String str = "abcbe";
        boolean palimdrome = isPalimdrome(str);
        System.out.println(palimdrome);

    }

    private static boolean isPalimdrome(String str) {
        char[] charStr = str.toCharArray();

        int start = 0;
        int end = charStr.length - 1;

        while (start < end) {
            if (charStr[start] != charStr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
