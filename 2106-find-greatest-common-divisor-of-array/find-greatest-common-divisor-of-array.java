class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int minValue = nums[0];
        int maxValue = nums[nums.length - 1];

        while(minValue != maxValue) {
            if(minValue > maxValue)
                minValue = minValue - maxValue;
            else
                maxValue = maxValue - minValue;
        }
        return minValue;
    }
}