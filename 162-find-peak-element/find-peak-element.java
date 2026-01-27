class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        for( i=0; i<nums.length-1; i++){
            boolean leftcheck = (i == 0 || nums[i]>nums[i-1]);
            boolean rightcheck = (i == nums.length-1 || nums[i]>nums[i+1]);
            if(leftcheck && rightcheck) {
                return i;
            }
        }
        return i;

    }
}
