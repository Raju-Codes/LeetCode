class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        for( i=0; i<nums.length-1; i++){
            if((i == 0 || nums[i]>nums[i-1]) && (i == nums.length-1 || nums[i]>nums[i+1])) 
            {
                return i;
            }
        }
        return i;

    }
}
