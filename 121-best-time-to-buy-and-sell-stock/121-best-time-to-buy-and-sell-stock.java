class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; //Least So Fear
        int op = 0; // Overall Profit
        int pist = 0; // Profit If sold today
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
            return op;
    }
}