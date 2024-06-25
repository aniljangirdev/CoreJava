package pack4.builder;

public class CyclicalPattern {
    public static void main(String[] args) {
        print();
    }

    static void print() {
        // cols = 4, rows = 7
        int cols = 10;
        int rows = 2;

        int initial = 1;
        int target = 6;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(initial + " ");
                if (initial == target) {
                    initial = 1;
                } else {
                    initial++;
                }
            }
            System.out.println();
        }
    }

}
