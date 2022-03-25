class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        
        int n = nums.length;
        int totalSum = 0, leftSum = 0;
        
        for(int i : nums)
            totalSum += i;
        
        for(int i = 0; i < n; i++){
            if(leftSum == (totalSum - nums[i]))
                return i;
         else {
            leftSum += nums[i];
            totalSum -= nums[i];
        }
    }
    return -1;
}
}