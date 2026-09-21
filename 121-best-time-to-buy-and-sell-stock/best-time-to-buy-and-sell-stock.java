class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, currProfit = 0;
        int minBuyPrice = prices[0];
        for(var currPrice : prices){
            if(currPrice<minBuyPrice) minBuyPrice = currPrice;
            else{
                currProfit = currPrice - minBuyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            }
        }
        return maxProfit;
    }
}