class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int p1 = 0, p2 = nums.length - 1;
        int curr = size - 1;
        int[] ans = new int[size];
        
        while(p1 <= p2) {
            int tempLeft = nums[p1] * nums[p1];
            int tempRight = nums[p2] * nums[p2];
            if(tempLeft > tempRight) {
                ans[curr] = tempLeft;
                curr--;
                p1++;
            } else {
                ans[curr] = tempRight;
                curr--;
                p2--;
            }
        }
        return ans;
    }
}