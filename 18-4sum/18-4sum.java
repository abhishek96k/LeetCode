class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);   
        Set<List<Integer>> result = new LinkedHashSet<>();
 
        for(int i=0; i<nums.length-3; i++) {
            for(int j = i+1; j<nums.length-2; j++) {
                int k = j+1;
                int l = nums.length-1;
                
                while (k<l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        result.add(list);
                        k++;
                        l--;
                    } else if(sum > target)
                        l--;
                    else 
                        k++;
                }
            }
        }
        return result.stream().collect(Collectors.toList());
    }
}