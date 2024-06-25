package pack4.builder;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prog2 {
    public static void main(String[] args) {
        /*
         * Problem statement
             Given an array of integers nums and an integer target,
             return the indices of the two numbers such that they add up to the target.
         */
        // TC : O(n), SC: O(n)
        int[] nums = new int[]{3, 2, 4, 8};
        int target = 12;
        int[] index = findIndexByMap(nums, target);
        System.out.println(Arrays.toString(index));
    }

    private static int[] findIndexByMap(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // 9 10
            if (integerMap.containsKey(diff)) { //
                return new int[]{integerMap.get(diff), i};
            } else {
                integerMap.put(nums[i], i); // 3
            }
        }
        return new int[]{-1, -1};
    }

    // [3, 0]
    // [2, 1]
    // [4, 2]
    // [8, 4]


    private static int[] findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }


}
