package javasolutions;

// Max Consecutive Ones
// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    // Solution
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1 && (nums[0] == 1 || nums[0] == 0))
            return nums[0];

        int consecutive = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutive++;
                max = Math.max(max, consecutive);
            } else {
                max = Math.max(max, consecutive);
                consecutive = 0;
            }
        }

        return max;
    }
}
