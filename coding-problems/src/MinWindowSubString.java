public class MinWindowSubString {
    public static String minWindow(String s, String t) {
        //your code goes here
        int n1=s.length();
        int n2=t.length();
        int hash[]=new int[256];
        int sIndex=-1;

        for(char ch:t.toCharArray()){
            hash[ch]++;
        }
        int cnt=0;
        int l=0,r=0;
        int minLen=Integer.MAX_VALUE;
        while(r<n1){
            char currChar=s.charAt(r);
            if(hash[currChar]>0) cnt++;
            hash[currChar]--;
            while(n2==cnt){
                if((r-l+1)<minLen){
                    minLen=r-l+1;
                    sIndex=l;
                }
                char ch=s.charAt(l);
                hash[ch]++;
                if(hash[ch]>0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return (sIndex == -1) ? "" : s.substring(sIndex, sIndex + minLen);
    }

    static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));
    }
}
