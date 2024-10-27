class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(i>maxIndex) break;
            maxIndex=Math.max(maxIndex,i+nums[i]);
            if(maxIndex>=n-1){
                return true;
            }
            
        }
        return false;
    }
}
