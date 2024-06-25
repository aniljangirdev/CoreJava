package pack4.builder;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int input = 371; // (3 * 3 * 3)  + (7 * 7 * 7) + (1 * 1 * 1) => 27 + 343 + 1 =>  371
        // 153 -> 1 * 5 * 3 ->
        boolean amstrong = isAmstrong(input);
        System.out.println(amstrong);
    }

    static boolean isAmstrong(int input) {
        // find modulo
        // cube of mod
        // add to number

        int sum = 0;
        int original = input; // 371

        while (0 < input) {
            //find mode
            int rem = input % 10; // 1
            int cube = (int) Math.pow(rem, 3); // 1
            sum +=  cube; // 10
            input = input / 10; //
        }

        return sum == original;
    }
}
