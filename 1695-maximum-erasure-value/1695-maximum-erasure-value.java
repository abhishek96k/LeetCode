class Solution {
    public int maximumUniqueSubarray(int[] nums){
        int max = 0, curr = 0;
        Set<Integer> set = new HashSet<>();
        for(int left = 0, right = 0; right < nums.length; right++){
            while(!set.add(nums[right])) {
                curr = curr - nums[left];
                set.remove(nums[left++]);
            }
            curr = curr + nums[right];
            max = Math.max(max, curr);
        }
        return max;
    }
}