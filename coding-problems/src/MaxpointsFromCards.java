/*
    Leetcode:1423
    problems link: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

    One Line Memory: " Pick k from ends = remove smallest middle subarray."

    Taking from ends = leaving a middle block
     So:
        max score = total sum - smallest middle block
 */
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
