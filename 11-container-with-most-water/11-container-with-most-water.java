class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int result = 0;
        
        while(start < end){
            int min = Math.min(height[start], height[end]);
            result = Math.max(result, min * (end - start));
            if(min == height[start])
                start++;
            else
                end--;
        }
        return result;
    }
}