import java.util.*;
/*
LeetCode: 3
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
“If current character is not present → expand window
If duplicate → shrink window until valid
Update max length at each step”
 */
public class LongestSubStringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left=0,right=0;
        int maxLen=0;
        Map<Character,Integer> map=new HashMap<>();

        while(right<n){
            char currChar=s.charAt(right);
            while(map.containsKey(currChar)){
                char ch=s.charAt(left);
                map.remove(ch);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            map.put(currChar,1);
            right++;
        }
        return maxLen;
    }
    /// optimal code for above eliminating while loop
    ///  using map:
    /// “I’ll store last seen index to jump left pointer directly.”
    public static int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    static void main(String[] args) {
        String str="abcddabgc";
        System.out.println(longestNonRepeatingSubstring(str));
    }
}
