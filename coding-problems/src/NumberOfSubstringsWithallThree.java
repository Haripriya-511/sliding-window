public class NumberOfSubstringsWithallThree {
    public int numberOfSubstrings(String s) {
        int n= s.length();
        int count=0;
        int[] lastSeen={-1,-1,-1};
        for(int r=0;r<n;r++){
            lastSeen[s.charAt(r)-'a']=r;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                count += 1 + Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]);
            }
        }
        return count;
    }
}
