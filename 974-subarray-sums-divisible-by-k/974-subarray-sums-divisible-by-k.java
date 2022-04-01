class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int[] count = new int[k];
        count[0] = 1;
        int perfix = 0, res = 0;
        for(int num : nums){
            perfix = ( perfix + num % k + k) % k;
            res += count[perfix]++;
        }
        return res;
    }
}
