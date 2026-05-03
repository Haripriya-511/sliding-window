
public class MaxpointsFromCards {
    public int maxScore(int[] cardScore, int k) {
        int n=cardScore.length;
        int window = n-k;
        int totalSum=0;
        int currSum=0;
        int minSum=Integer.MAX_VALUE;
        int l=0,r=0;
        while(r<n){
            totalSum+=cardScore[r];
            currSum+=cardScore[r];
            if((r-l+1)==window){
                minSum=Math.min(minSum,currSum);
                currSum-=cardScore[l];
                l++;
            }
            r++;
        }
        return totalSum-minSum;
    }
}
