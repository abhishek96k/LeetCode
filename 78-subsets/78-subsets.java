class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<>();
        rec(nums,0,curr,list);
        return list;
    }
            
       public void rec(int[] nums, int i, List<Integer> curr, List<List<Integer>> list){
            if(i == nums.length){
                list.add(new ArrayList<Integer>(curr));
                return;
            }
            curr.add(nums[i]);
            rec(nums, i + 1, curr, list);
            curr.remove(curr.size() - 1);
            rec(nums, i + 1, curr, list);
        }
}