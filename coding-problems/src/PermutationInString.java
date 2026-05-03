public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int []hash=new int[26];
        for(char ch: s1.toCharArray()){
            hash[ch-'a']++;
        }
        int l=0,r=0;
        int cnt=0;
        while(r<n2){
            char currChar = s2.charAt(r);
            if(hash[currChar-'a']>0) cnt++;
            hash[currChar-'a']--;
            while((r-l+1)>n1){
                hash[s2.charAt(l)-'a']++;
                if(hash[s2.charAt(l)-'a']>0)
                    cnt--;
                l++;
            }
            if(cnt==n1){
                return true;
            }
            r++;
        }
        return false;
    }
}
