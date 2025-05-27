import java.lang.Math;

public class LongestSubArrayWithSum {
    public static int longestsubarray(int[] nums, int k) {
        int left = 0, right = 0;
        int n = nums.length;
        int maxLen = 0;
        long sum = nums[0];
        while (right < n) {
            if (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n)
                sum += nums[right];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int k = 6;
        System.out.println("The Longest SubArray With Sum " + k + " is : " + longestsubarray(arr, k));
    }
}