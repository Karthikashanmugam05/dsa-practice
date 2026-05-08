class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int left=0;left<=nums.length-k;left++){
            int right=left+k-1;
            int diff=nums[right]-nums[left];
            minDiff=Math.min(minDiff,diff);
            
        }
        return minDiff;
        
    }
}