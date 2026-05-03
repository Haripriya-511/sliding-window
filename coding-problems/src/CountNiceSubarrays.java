public class CountNiceSubarrays {
    public int numberOfOddSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int nums[],int k){
        if(k<0)
            return 0;
        int count=0;
        int l=0,r=0;
        int n=nums.length;
        int oddcount=0;
        while(r<n){
            if(nums[r]%2==1)
                oddcount++;
            while(oddcount>k){
                if(nums[l]%2==1)
                    oddcount--;
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}
