import java.util.HashMap;

public class SubaArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1); // Default case to handle when prefix sum itself is k

        int count = 0, sum = 0;

        for (int num : nums) {
            sum += num; // Compute running sum

            // Check if (sum - k) is in HashMap
            if (sumMap.containsKey(sum - k)) {
                count += sumMap.get(sum - k); // Add the count of previous sums that satisfy condition
            }

            // Update HashMap with current sum frequency
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }

        return count; // Total number of subarrays found
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 1 };
        int[] nums2 = { 1, 2, 3 };

        System.out.println(subarraySum(nums1, 2));
        System.out.println(subarraySum(nums2, 3));
    }
}
