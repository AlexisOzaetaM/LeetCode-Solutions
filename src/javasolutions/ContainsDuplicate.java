package javasolutions;

import java.util.Arrays;

//  Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] test1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(test1));

        int[] test2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(test2));
    }

    // Solution
    public static boolean containsDuplicate(int[] nums) {
        boolean res = false;
        if (nums.length > 1) {
            if (nums[0] == nums[1])
                res = true;
            else {
                Arrays.sort(nums);
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] == nums[i + 1])
                        res = true;
                }
            }
        }

        return res;
    }
}
