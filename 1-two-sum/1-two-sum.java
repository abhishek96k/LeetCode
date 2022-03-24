class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer reqNum = (Integer)(target - nums[i]);
            if(indexMap.containsKey(reqNum)){
                int toReturn[] = {indexMap.get(reqNum), i};
                return toReturn;
            }
            indexMap.put(nums[i],i);
        }
        return null;
}
}