class Solution {
    public int maxProfit(int[] prices) {
        int right = 0;
        int max = 0;
        int left = 0;
        for(right = 0; right < prices.length; right++) {
            if(prices[left] < prices[right]) {
                max = Math.max(max, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return max;
    }
}