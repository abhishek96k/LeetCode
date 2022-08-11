class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int p1 = 0;
        int p2 = nums.length - 1;
        int curr = size - 1;
        int[] ans = new int[size];
        
        while(p1 <= p2){
            int leftSide = nums[p1] * nums[p1];
            int rightSide = nums[p2] * nums[p2];
            if(leftSide > rightSide){
                ans[curr] = leftSide;
                curr--;
                p1++;
            } else {
                ans[curr] = rightSide;
                curr--;
                p2--;
            }
        }
        return ans;
    }
}