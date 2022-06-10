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
//         form index : left to nums.length - 1, with 0's
        for(int i = left; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
// TC: o(n) SC: o(1)