class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int fi = 0;
        int li = nums.length - 1;
        int ni = li;
        int[] idx = new int[ni + 1];
        
        while (fi <= li){
            if(Math.abs(nums[fi]) < (Math.abs(nums[li]))){
                idx[ni] = nums[li] * nums[li];
                li--;
            } else {
                idx[ni] = nums[fi] * nums[fi];
                fi++;
            }
            ni--;
        }
            return idx;
    }
}



















