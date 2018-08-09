class BestTimeToBuyAndSellStockII {
   public int maxProfit(int[] prices) {
        int currMax = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                currMax = Math.max(currMax, currMax + prices[i] - prices[i-1]);
            }
        }
        return currMax;
   }
}
