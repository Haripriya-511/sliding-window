import java.util.*;
public class FindAllAnagarams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int[] hash=new int[26];
        for(char ch: p.toCharArray()){
            hash[ch-'a']++;
        }
        int l=0,r=0;
        int n1=s.length();
        int cnt=0;
        int n2=p.length();
        while(r<n1){
            int currChar= s.charAt(r)-'a';
            if(hash[currChar]>0)
            {
                cnt++;
            }
            hash[currChar]--;
            if(r-l+1 > n2){
                hash[s.charAt(l)-'a']++;
                if(hash[s.charAt(l)-'a']>0)
                    cnt--;
                l++;
            }
            if(cnt==n2){
                res.add(l);
            }

            r++;
        }
        return res;
    }
}
