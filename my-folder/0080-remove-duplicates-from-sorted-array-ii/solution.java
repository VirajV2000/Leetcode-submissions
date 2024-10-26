class Solution {
    public int removeDuplicates(int[] nums) {
        // int l=0,r=0;
        int n=nums.length;
        
       
       int k=2;
       for(int i=2;i<n;i++){
        if(nums[i]!=nums[k-2]){
            nums[k++]=nums[i];
        }
       }
       return k;
    }
}
