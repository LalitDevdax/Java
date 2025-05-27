import java.lang.Math;

public class MaxSumSubArray {
    public static int maxsumsubarray(int[] nums, int k) {
        long sum = 0;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];
            if (sum > maxi) {
                maxi = (int) sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (maxi < 0) {
            maxi = 0;
        }
        ;
        System.out.println("Max Sum Subarray:");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nMax Sum: " + maxi);

        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 2, 2, 3, -3 };
        int k = 6;
        maxsumsubarray(arr, k);
    }
}
