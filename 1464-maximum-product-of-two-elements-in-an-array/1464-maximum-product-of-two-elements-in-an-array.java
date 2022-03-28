class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null) return 0;
        
        int ind1 = Integer.MIN_VALUE;
        int ind2 = Integer.MIN_VALUE;
        
        for(int num : nums){
            if(num >= ind1){
                ind2 = ind1;
                ind1 = num;
            } else if(num >= ind2){
                ind2 = num;
            }
        }
        return (ind1 - 1) * (ind2 - 1);
    }
}