class Solution {
    public int heightChecker(int[] heights) {
        int[] expectedVal = heights.clone();
        Arrays.sort(expectedVal);
        int count = 0;
        for (int i = 0; i < expectedVal.length; i++) {
            if (heights[i] != expectedVal[i])
                count++;
        }
        return count;
    }
}