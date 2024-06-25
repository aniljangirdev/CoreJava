package pack3;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        // NumberOfGoodPairs
        int[] nums = {1,1,1,1};
        int[] numsPairs = {1,2,3,1,1,3};
        int numberOfPairs = findNumberOfPairs(nums);
        int numberOfPairs1 = findNumberOfPairsHashMap(numsPairs);
        System.out.println(numberOfPairs1);

        //

        // {1,4}, {}
        // 0 + 1 + 2 + 3
        // 1, 2, 3, 1, 1, 3

    }

    static int findNumberOfPairsHashMap(int[] nums) {
        int totalCount = 0;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int num : nums) {
            Integer no = integerMap.getOrDefault(num, 0);
            totalCount += no;
            integerMap.put(num, no + 1);
        }
        return totalCount;
    }

    static int findNumberOfPairs(int[] nums) {
        int totalCount = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    totalCount += 1;
                }
            }
        }
        return totalCount;
    }
}
