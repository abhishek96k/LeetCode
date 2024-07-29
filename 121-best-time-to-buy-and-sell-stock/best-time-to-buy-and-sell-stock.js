/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let right = 0;
    let left = 0;
    let profit = 0;

    for(right = 0; right < prices.length; right++) {
        if(prices[left] < prices[right]) {
            profit = Math.max(profit, prices[right] - prices[left]);
        } else {
            left = right;
        }
    }
    return profit;
};