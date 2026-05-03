import java.util.HashMap;
import java.util.Map;

public class LongestCharacterRepeatingPlacement {
    public int characterReplacement(String s, int k) {
        //your code goes here
        // subarray length-maxFreq <= k
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int maxFreq=0;
        int maxLen=0;
        int l=0;
        for(int r=0;r<n;r++){
            char currChar=s.charAt(r);
            map.put(currChar,map.getOrDefault(currChar,0)+1);
            maxFreq=Math.max(maxFreq,map.get(currChar));
            if((r-l+1)-maxFreq > k){
                char ch= s.charAt(l);
                map.put(ch,map.get(ch)-1);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);

        }
        return maxLen;
    }
}
