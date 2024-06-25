package pack4.builder;

public class Prog6 {

    public static void main(String[] args) {
        int[] nos = new int[]{46, 22, 16, 1, 12, 33, 43};

        int secondLargestNum = findSecondLargestNum(nos);
        System.out.println(secondLargestNum);
    }

    private static int findSecondLargestNum(int[] nos) {
        if (nos.length == 0) return -1;

        if (nos.length == 1) return nos[0];

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int value : nos) {
            // check for first
            if (first < value) {
                second = first;
                first = value;
            }

            // check for second
            if (value != first && value > second) {
                second = value;
            }
        }
        return second;
    }
}
