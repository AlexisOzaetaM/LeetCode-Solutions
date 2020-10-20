package javasolutions;

import java.util.HashMap;
import java.util.Map;

// Single Number
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    // Solution
    public static int singleNumber(int[] nums) {
        if (nums.length != 2) {
            Map<Integer, Integer> numbers = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (numbers.containsKey(nums[i])) {
                    int aux = numbers.get(nums[i]);
                    numbers.put(nums[i], ++aux);
                } else
                    numbers.put(nums[i], 1);
            }

            for (int i = 0; i < nums.length; i++) {
                if (numbers.get(nums[i]) == 1)
                    return nums[i];
            }
        }

        return 0;
    }
}
