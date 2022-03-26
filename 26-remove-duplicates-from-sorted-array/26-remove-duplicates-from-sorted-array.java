class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        int ptrOne = 0;
        
        for(int ptrTwo = 0; ptrTwo < nums.length; ptrTwo++){
            if(nums[ptrTwo] != nums[ptrOne]){
                ptrOne++;
                nums[ptrOne] = nums[ptrTwo];
            }
        }
        return ptrOne + 1;
    }
}