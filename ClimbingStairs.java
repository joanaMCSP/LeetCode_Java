class ClimbingStairs {

  public int climbStairs(int n) {
    if (n < 2) {
      return 1;
    }
    if (n == 2) {
      return n;
    }
    int beforePrevious = 1;
    int previous = 2;
    int current = 0;
    for (int i = 3; i <= n; i++) {
      current = beforePrevious + previous;
      beforePrevious = previous;
      previous = current;
    }
    return current;
  }
}
