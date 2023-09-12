class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return new int[0];
        int[] ans = new int[nums.length];

        int rightProduct = 1;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = rightProduct;
            rightProduct = rightProduct * nums[i]; 
        }

        rightProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return ans;
    }
}