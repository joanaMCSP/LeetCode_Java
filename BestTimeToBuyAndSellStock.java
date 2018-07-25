class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }
    int maxDiff = 0;
    int minSoFar = Integer.MAX_VALUE;

    for (int i = 0; i < prices.length; i++) {
      minSoFar = Math.min(minSoFar, prices[i]);
      maxDiff = Math.max(maxDiff, prices[i] - minSoFar);
    }
    return maxDiff;
  }
}
