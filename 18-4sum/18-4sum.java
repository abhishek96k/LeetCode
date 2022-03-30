class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> resSet = new HashSet<>();
    int len = nums.length;
    if (nums == null || len <= 3){ return new ArrayList<>(); }
    Arrays.sort(nums);
    for(int i = 0; i < len; i++){
        for(int j = i+1; j < len; j++){
            Set<Integer> set = new HashSet<>();
            for(int k = j+1; k < len; k++){
                int threeSum = nums[i] + nums[j] + nums[k];
                if(!set.contains(nums[k])){ set.add(target - threeSum); }
                else{
                    resSet.add( Arrays.asList(nums[i], nums[j], nums[k], target - threeSum) );
                }
            }
        }
    }
    List<List<Integer>> resList = new ArrayList<>(resSet);
    return resList;
    }
}