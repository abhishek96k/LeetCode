class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer res = null;
        
        for(int num : nums) {
            if(count == 0){
                res = num;
            }
            count += (num == res) ? 1 : -1;
        }
        return res;
    }
}