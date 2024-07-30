package pack2;

public class ShortestWordDistance {

    public static void main(String[] args) {
        // find the distance of given two characters

        // which data structure require to solve below problem?
        // first try to solve via brute force
        // optimize it with time complexity and space complexity

        String[] input = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] input1 = {"a", "c", "d", "b", "a"};
        String w1 = "a";
        String w2 = "b";
        String word1 = "fox";
        String word2 = "dog";

        // assume total length of the string
        // as minimum distance
        int output = getShortestWordDistance(input1, w1, w2);
        int output1 = getShortestWordDistance1(input, word1, word2);

        System.out.println(output1);
    }

    // find minimum distance of two word from string
    /*
    with TC O(n2) and SC O(n)
    * */
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

    // with TC O(n), SC O(1)
    private static int getShortestWordDistance1(String[] input, String word1, String word2) {
        int i1 = -1;
        int i2 = -1;
        int shortest = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(word1)) {
                i1 = i;
            }
            if (input[i].equals(word2)) {
                i2 = i;
            }

            if (i1 != -1 && i2 != -1) {
                int distance = Math.abs(i1 - i2);
                if (distance < shortest) {
                    shortest = distance;
                }
            }
        }
        return shortest;
    }

}
