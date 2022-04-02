class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
//         [3,4,-1,1]
        for(int i = 0; i < n; i++){
            if(nums[i] <= 0 || nums[i] > n)
                nums[i] = n + 1;
        }
//         [3,4,5,1]
        for(int i = 0; i < n; i++){
            int id = Math.abs(nums[i]);
            if(id > n) continue;
            id--;
            if(nums[id] > 0)
                nums[id] = -nums[id];
        }
//         [-3,4,-5,-1]
        for(int i = 0; i < n; i++){
            if(nums[i] > 0)
                return i + 1;
        }
        return n + 1;
    }
}