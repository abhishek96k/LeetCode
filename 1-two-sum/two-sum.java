class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if(map.containsKey(dif)) {
                ans[1] = i;
                ans[0] = map.get(dif);
            }
            map.put(nums[i], i);
        } 
        return ans;
    }
}