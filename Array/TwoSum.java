import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twosum(int[] nums, int target) {

        // Brute Force
        // int n = nums.length;
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { nums[i], nums[j] };
        // }
        // }
        // }
        // return new int[] {};

        // Better Soln
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // int complement = target - nums[i];
        // if (map.containsKey(complement)) {
        // return new int[] { nums[map.get(complement)], nums[i] };
        // }
        // map.put(nums[i], i);
        // }

        // return new int[] {};

        // Optimised Soln -
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { nums[left], nums[right] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 6, 8, 9, 9 };
        int target = 14;
        System.out.println(
                "The Target Sum " + target + " Is Achieved By Elements : " + Arrays.toString(twosum(nums, target)));
    }
}
