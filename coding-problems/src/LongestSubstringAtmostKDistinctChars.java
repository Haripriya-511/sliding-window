import java.util.HashMap;
import java.util.Map;

public class LongestSubstringAtmostKDistinctChars
{
    public int kDistinctChar(String s, int k) {
        int n=s.length();
        int l=0,r=0;
        Map<Character,Integer> map=new HashMap<>();
        int maxLen=0;
        while(r<n){
            char currChar=s.charAt(r);
            map.put(currChar,map.getOrDefault(currChar,0)+1);
            while(map.size()>k){
                char ch=s.charAt(l);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);

            r++;
        }
        return maxLen;
    }
}
