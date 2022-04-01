class Solution {
    public boolean canJump(int[] nums) {
        
        int maxLocation = 0;
        
        for(int i = 0; i < nums.length; i++){
        if(maxLocation < i) return false;
        maxLocation = (nums[i] + i) > maxLocation ? nums[i] + i : maxLocation;
    }     
    return true;
   }
}


