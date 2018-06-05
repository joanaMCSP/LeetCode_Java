class CoinChange {

  public int coinChange(int[] coins, int amount) {
    int[] cache = new int[amount + 1];

    for (int i = 1; i <= amount; i++) {
      int min = amount + 1;
      for (int coin : coins) {
        if (i - coin >= 0) {
          int minCoins = cache[i - coin] + 1;
          min = min > minCoins ? minCoins : min;
        }
      }
      cache[i] = min;
    }
    return cache[amount] <= amount ? cache[amount] : -1;
  }
}
