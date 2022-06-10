class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 0){
                nums[left] = nums[right];
                left++;
            }
        }
        for(int i = left; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
// TC: o(n) SC: o(1)