class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            int minArea = Math.min(height[start], height[end]);
            ans = Math.max(ans, minArea * (end - start));
            if (minArea == height[start])
                start++;
            else
                end--;
        }
        return ans;
    }
}