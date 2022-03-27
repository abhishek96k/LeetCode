class Solution {
    public int maxArea(int[] height) {
        int l = 0;      // left idx
        int r = height.length - 1;      // right idx
        int max = 0;        // max water
        
        while(l <= r){
            int lh = height[l];     // left height
            int rh = height[r];     // right height
            int min_h = Math.min(lh, rh); 
            max = Math.max(max, min_h*(r - l));
            if(lh <= rh) l++;
            else r--;
        }
        return max;
    }
}