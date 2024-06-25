package pack4.builder;

public class BS {
    public static void main(String[] args) {
        int[] input = new int[]{1, 5, 9, 13, 15, 19, 22, 26, 28, 30};
        int target = 10;
        int i = searchIndex(input, target);
        System.out.println(i);
    }

    static int searchIndex(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (target > input[mid]) { // mid = 15
                start = mid + 1;
            } else if (target < input[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

}
