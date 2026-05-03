/*
LeetCode: 1004
https://leetcode.com/problems/max-consecutive-ones-iii/description/
One-line memory:
👉 “Expand window, allow ≤ k zeroes, shrink when exceeded.”
 */
public class MaxConsecutiveOnes {
        public int longestOnes(int[] nums, int k) {
            int n=nums.length;
            int l=0,r=0;
            int zeroesCount=0;
            int maxConsectiveOnes=0;
            while(r<n){
                if(nums[r]==0){
                    zeroesCount++;
                }
                while(zeroesCount>k){
                    if(nums[l]==0){
                        zeroesCount--;
                    }
                    l++;
                }
                maxConsectiveOnes=Math.max(maxConsectiveOnes,r-l+1);
                r++;
            }
            return maxConsectiveOnes;

        }

}
