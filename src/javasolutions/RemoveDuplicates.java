package javasolutions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
    // Solution
    // https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;

        int last = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[last] != nums[i]) {
                last += 1;
                nums[last] = nums[i];
            }
        }
        return last + 1;
    }
}
