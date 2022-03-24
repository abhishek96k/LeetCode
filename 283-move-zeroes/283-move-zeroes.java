class Solution {
    public void moveZeroes(int[] nums) {
        int cur = 0;
        int i = 0;
        
        while ( cur < nums.length){
            if( nums[cur] == 0){
                cur++;
            } else {
                nums[i] = nums[cur];
                i++;
                cur++;
            }
        }
        
        while ( i < nums.length){
            nums[i] = 0;
            i++;
        
        }
    }
}
