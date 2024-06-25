package pack3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {


        int n = 236489;
        int temp = n; // 236489
        int rev = 0; //
        while (temp > 0) {
            int rem = temp % 10; // 9
            rev = rev * 10 + rem;  // 0 * 10 + 9 = 9
            temp = temp / 10; // 236489
        }
        System.out.print(rev);

        int[] arr=new int[]{100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }
}
