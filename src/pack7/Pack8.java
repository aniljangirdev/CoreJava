package pack7;

import java.util.Scanner;

public class Pack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);

        float val = 150;
        String format = String.format("%.2f", val);
        System.out.println(format);

        char ch = 'a'; // 97
        char ch1 = 'A'; // 65
        System.out.println((int)ch);

        int a = 1;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;
    }
}
