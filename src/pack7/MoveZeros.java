package pack7;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] input = new int[]{0, 1, 0, 3, 0, 12};
        int[] result = moveZerosToEnd0(input);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZerosToEnd0(int[] input) {
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0 && input[j] == 0) {
                swap(input, i, j);
            }

            if (input[j] != 0) {
                j++;
            }
        }
        return input;
    }


        private static int[] moveZerosToStart(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] != 0 && input[j] == 0) {
                    swap(input, i, j);
                }
            }
        }
        return input;
    }

    private static int[] moveZerosToEnd(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == 0 && input[j] != 0) {
                    swap(input, i, j);
                }
            }
        }
        return input;
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}