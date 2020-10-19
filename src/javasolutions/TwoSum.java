package javasolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Two Sum
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/546/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        Arrays.stream(twoSum(nums, 9)).forEach(System.out::println);
    }

    // Solution
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return nums;
    }
}
