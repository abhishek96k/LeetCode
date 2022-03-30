class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        for(int num1Idx = 0; num1Idx < nums.length; num1Idx++){
            if(num1Idx > 0 && nums[num1Idx] == nums[num1Idx - 1]){
                continue;
        }
            int num2Idx = num1Idx + 1;
            int num3Idx = nums.length - 1;
            while(num2Idx < num3Idx){
                int sum = nums[num2Idx] + nums[num3Idx] + nums[num1Idx];
                if(sum == 0){
                    result.add(Arrays.asList(nums[num1Idx], nums[num2Idx], nums[num3Idx]));
                    num3Idx--;
                    while(num2Idx < num3Idx && nums[num3Idx] == nums[num3Idx + 1]) num3Idx--;
                } else if(sum > 0){
                    num3Idx--;
                } else {
                    num2Idx++;
                }
            }
        }
        return result;
    }
}