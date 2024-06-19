package pack2;

public class ShortestWordDistance {

    public static void main(String[] args) {
        // find the distance of given two characters

        // which data structure require to solve below problem?
        // first try to solve via brute force
        // optimize it with time complexity and space complexity

        String[] input = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] input1 = {"a", "c", "d", "b", "a"};
        String word1 = "fox";
        String word2 = "dog";

        // assume total length of the string
        // as minimum distance
        int output = getShortestWordDistance(input, word1, word2);

        System.out.println(output);
    }

    // find minimum distance of two word from string
    private static int getShortestWordDistance(String[] input, String word1, String word2) {

        if (word1.equals(word2)) return 0;

        int minDist = input.length + 1;

        for (int i = 0; i < input.length; i++) {

            // from below condition we start counting
            if (input[i].equals(word1)) {
                for (int j = 0; j < input.length; j++) {
                    // below condition for second word and get distance

                    if (input[j].equals(word2)) {

                        int current = Math.abs(i - j);

                        if (current < minDist) {
                            minDist = current;
                            break;
                        }
                    }
                }
            }
        }
        return minDist;
    }
}
