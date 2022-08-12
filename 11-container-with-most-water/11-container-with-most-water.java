class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        
        while(start < end){
            int min = Math.min(height[start], height[end]);
            max = Math.max(max, min * (end - start));
            if(min == height[start])
                start++;
            else
                end--;
        }
        return max;
    }
}