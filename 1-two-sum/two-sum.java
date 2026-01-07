class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ind = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            int complement = target-nums[i];
            if(ind.containsKey(complement)) {
                return new int[] {ind.get(complement),i};
            }
            ind.put(nums[i], i);
        }
        return new int[] {};
    }
}