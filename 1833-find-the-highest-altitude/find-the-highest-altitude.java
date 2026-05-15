class Solution {
    public int largestAltitude(int[] gain) {
        int curAlt=0;
        int maxAlt=0;
        for(int val:gain){
            curAlt+=val;
            maxAlt=Math.max(curAlt,maxAlt);
        }
        return maxAlt;
        
    }
}