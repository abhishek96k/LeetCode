class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int totalSum = 0;
        for(int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
        }
        for(int i = 0; i <= nums.length; i++) {
            totalSum += i;
        }
        return totalSum - sum;
    }
}