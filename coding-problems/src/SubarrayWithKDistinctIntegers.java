import java.util.HashMap;
import java.util.Map;

public class SubarrayWithKDistinctIntegers {
    public int subArrayCount(int nums[],int k){
        int n=nums.length;
        int l=0,r=0;
        Map<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0)
                    map.remove(nums[l]);
                l++;
            }
            cnt+= (r-l+1);
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArrayCount(nums,k)- subArrayCount(nums,k-1);
    }
}
