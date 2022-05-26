class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int curMax = nums[0];
        int allMax = nums[0];
        for(int i = 1; i < nums.length; i++) {
            curMax = Math.max(nums[i], curMax + nums[i]);
            allMax = Math.max(allMax, curMax);
        }
        return allMax;
    }
}