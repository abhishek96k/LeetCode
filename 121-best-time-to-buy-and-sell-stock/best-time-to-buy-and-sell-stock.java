class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int profit = 0;
        if (prices.length <= 1)
            return 0;
        for (right = 0; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return profit;
    }
}