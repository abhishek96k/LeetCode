class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 0, ans = 0;
        if(prices.length == 1) return 0;
        for(right = 0; right < prices.length; right++){
            if(prices[left] < prices[right]){
                ans = Math.max(ans, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return ans;
    }
}