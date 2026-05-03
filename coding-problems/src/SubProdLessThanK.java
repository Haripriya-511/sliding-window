public class SubProdLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int n=nums.length;
        int l=0;
        int r=0;
        int prod=1;
        int cnt=0;
        while(r<n){
            prod*=nums[r];

            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            int len= r-l+1;
            cnt+=len;

            r++;
        }

        return cnt;
    }
}
