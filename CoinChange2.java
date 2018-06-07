class CoinChange2 {

  public int change(int amount, int[] coins) {
    int[] cache = new int[amount + 1];

    cache[0] = 1;

    for (int coin : coins) {
      for (int i = 1; i <= amount; i++) {
        if (i - coin >= 0) {
          cache[i] += cache[i - coin];
        }
      }
    }
    return cache[amount];
  }
}
