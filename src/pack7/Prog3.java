package pack7;

public class Prog3 {
    public static void main(String[] args) {
        String str = "  hello world  ";
        String output = reverseWordByString(str);
        System.out.println(output);
    }

    private static String reverseWordByString(String str) {
        String[] strArr = str.split("\\s+");

        int start = 0;
        int end = strArr.length - 1;
        while (start < end) {
            String temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", strArr);
    }
}
