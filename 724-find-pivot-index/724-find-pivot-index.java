class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1)
            return 1;
        
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            //  total sum of aaray
            totalSum += nums[i];
        } 
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            // this will act as rightsum now
            totalSum -= nums[i];
            if(leftSum == totalSum){
                return i;
            } 
            leftSum += nums[i];
        }
        return -1;
    }
}