package pack1;

import java.util.regex.Pattern;

public class ValidPralimdrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";
        boolean validPalimdrome = isValidPalimdrome(input);
        System.out.println(validPalimdrome);

        String output = removeAlfabatic(input);
        System.out.println(output);
    }

    private static boolean isValidPalimdrome(String input) {
        input = removeAlfabatic(input);
        char[] chars = input.toCharArray();
        // using two pointer technique
        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            if (chars[i] != chars[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    // except only Alphabetic or numeric
    private static String removeAlfabatic(String str){
       return str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    }

    //write a regex for number should be allowed 10 or 13 digits only
    private static boolean isNumberOf10OR13(String input) {
        String regex = "(^[0-9]{10}|[0-9]{13})";
        return Pattern.matches(regex, input);
    }

}
