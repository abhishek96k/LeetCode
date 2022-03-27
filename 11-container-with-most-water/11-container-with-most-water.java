class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        
        while(l < r){
            int min_h = Math.min(height[l], height[r]);
            max = Math.max(max, min_h*(r - l));
            if(min_h == height[l]) l++;
            else r--;
        }
        return max;
    }
}