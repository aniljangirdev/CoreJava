package pack7;

import java.util.*;

public class Prog2 {
    public static void main(String[] args) {

        // two sum that equal target
        int[] nums = new int[]{3,2,4};
        /*
         [3, 0]
         [2 , 1]
         [4. 2]
        * */
        int target = 6;
        int[] result = findTwoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findTwoSum (int[] nums, int target){
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
