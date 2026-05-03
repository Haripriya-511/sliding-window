import java.util.HashSet;
import java.util.Set;

public class MaxSumOfDistinctSubarrLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = 0, sum = 0;
        int l = 0;
        Set<Integer> seen = new HashSet<>();

        for (int r = 0; r < n; r++) {

            while (seen.contains(nums[r]) || r - l + 1 > k) {
                seen.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            seen.add(nums[r]);
            sum += nums[r];

            if (r - l + 1 == k)
                maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
