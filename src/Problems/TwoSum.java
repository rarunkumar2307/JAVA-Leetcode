package Problems;

import java.util.Arrays;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // no solution
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 5;
        int[] result = obj.twoSum(nums, target);
        System.out.println("Result indices: " + Arrays.toString(result));
    }
}

