class Solution {
    public int minMoves2(int[] nums) {
//         Sort the array 
        Arrays.sort(nums);
//         Calculate the steps by taking 2 pointers
        int i = 0, j = nums.length - 1;
        int steps = 0;
        while(i < j){
            steps += nums[j] - nums[i];
            i++;
            j--;
        }
        return steps;
    }
}